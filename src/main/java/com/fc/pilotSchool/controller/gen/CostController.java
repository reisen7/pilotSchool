package com.fc.pilotSchool.controller.gen;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.alibaba.fastjson.JSONObject;
import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.model.auto.*;
import com.fc.pilotSchool.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/CostController")
public class CostController extends BaseController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StaffService staffService;

    @Autowired
    private MachineService machineService;

    @Autowired
    private PlaceService placeService;

    @Autowired
    private FacilityService facilityService;

    @RequestMapping("/view")
    @SaCheckPermission("gen:cost:view")
    public String getDate(){
        return "/cost";
    }

    @ResponseBody
    @PostMapping("/getCategory")
    @SaCheckPermission("gen:cost:view")
    public AjaxResult getCategory(){
        //折线图的横坐标
        List<String> list = new ArrayList<>();
        list.add("教练工资");
        list.add("工作人员工资");
        list.add("场地费用");
        list.add("设备费用");
        list.add("设施费用");
        JSONObject jsonObject = new JSONObject();


        List<String> countList = new ArrayList<>();
        List<Teacher> teacherList = teacherService.selectByExample(null);
        double count = teacherList.stream().mapToDouble(x -> Double.valueOf(x.getWages())).sum();
        countList.add(count+"");
        List<Staff> staffList = staffService.selectByExample(null);
        count = staffList.stream().mapToDouble(x -> Double.valueOf(x.getWages())).sum();
        countList.add(count+"");
        List<Place> placeList = placeService.selectByExample(null);
        count = placeList.stream().mapToDouble(x -> Double.valueOf(x.getCost())).sum();
        countList.add(count+"");
        List<Machine> machineList = machineService.selectByExample(null);
        count = machineList.stream().mapToDouble(x -> Double.valueOf(x.getCost())).sum();
        countList.add(count+"");
        List<Facility> facilities = facilityService.selectByExample(null);
        count = facilities.stream().mapToDouble(x -> Double.valueOf(x.getCost())).sum();
        countList.add(count+"");

        jsonObject.put("categoryList",list);
        jsonObject.put("costList",countList);
        return retobject(200,jsonObject);
    }
}
