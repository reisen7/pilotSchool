package com.fc.pilotSchool.controller;

import com.alibaba.fastjson.JSONObject;
import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.model.auto.*;
import com.fc.pilotSchool.service.StudenfeesService;
import com.fc.pilotSchool.service.StudentService;
import com.fc.pilotSchool.service.TrainCategoryService;
import com.fc.pilotSchool.service.TrainInfoService;
import com.fc.pilotSchool.service.baseService.SysRoleService;
import com.fc.pilotSchool.service.baseService.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class RegisterController extends BaseController {

    @Autowired
    private TrainInfoService trainInfoService;

    @Autowired
    private TrainCategoryService trainCategoryService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysRoleService sysRoleService;

    @Autowired
    private StudenfeesService studenfeesService;


    @ApiOperation(value = "注册", notes = "注册")
    @RequestMapping("/register")
    public String register(HttpServletRequest request, Map<String,Object> map) {
        List<TrainInfo> trainInfoList = trainInfoService.selectByExample(null);
        trainInfoList.get(1).getTrainCategory();
        trainInfoList.forEach(x-> x.setTrainCategory(trainCategoryService.selectByPrimaryKey(x.getTrainCategory()).getTrainingName()));
        map.put("trainInfoList",trainInfoList);
        return "register";
    }

    @ResponseBody
    @PutMapping("/register/getTrain")
    public AjaxResult getTrainPay(HttpServletRequest request,
                                  @RequestBody Map<String,Object> mapData){
        String trainId = (String) mapData.get("trainId");
        System.out.println(trainId);
        TrainInfo trainInfo = trainInfoService.selectByPrimaryKey(trainId);
        TrainCategory trainCategory = trainCategoryService.selectByPrimaryKey(trainInfo.getTrainCategory());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("pay",trainCategory.getPay());
        return AjaxResult.successData(200,jsonObject);
    }


    @PostMapping("/register/add")
    @ResponseBody
    public AjaxResult add(Student student){
        student.setUsername("S"+student.getUsername());
        TsysUser tsysUser = new TsysUser();
        tsysUser.setPassword(student.getPwd());
        tsysUser.setUsername(student.getUsername());
        tsysUser.setNickname(student.getTrueName());
        TsysRoleExample tsysRoleExample = new TsysRoleExample();
        tsysRoleExample.createCriteria().andNameEqualTo("学生");
        List<TsysRole> tsysRoles = sysRoleService.selectByExample(tsysRoleExample);
        int c=sysUserService.insertUserRoles(tsysUser,tsysRoles.get(0).getId());
        int b=studentService.insertSelective(student);
        Studenfees studenfees = new Studenfees();
        //获得培训费用
        studenfees.setCost(trainCategoryService.selectByPrimaryKey(trainInfoService.selectByPrimaryKey(student.getTrainId()).getTrainCategory()).getPay());
        studenfees.setIsPay(student.getIspay().toString());
        studenfees.setSId(student.getId());
        studenfeesService.insertSelective(studenfees);
        if(b>0){
            return success();
        }else{
            return error();
        }
    }

    @ResponseBody
    @PutMapping("/register/getUser")
    public AjaxResult getUser(HttpServletRequest request,
                                  @RequestBody Map<String,Object> mapData){
        String username = (String) mapData.get("username");
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andUsernameEqualTo("S"+username);
        List<Student> students= studentService.selectByExample(studentExample);
        if (students.size()>0){
            return AjaxResult.success("已有用户");
        }
        return AjaxResult.error();
    }
}
