package com.fc.pilotSchool.controller.gen;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.mapper.auto.MachineMapper;
import com.fc.pilotSchool.model.auto.*;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.service.TrainInfoService;
import com.fc.pilotSchool.service.TrainingInfoService;
import com.fc.pilotSchool.util.DateUtils;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 训练信息管理Controller
 * @ClassName: TrainingInfoController
 * @author fuce
 * @date 2023-05-10 21:53:52
 */
@Api(value = "训练信息管理")
@Controller
@RequestMapping("/TrainingInfoController")
public class TrainingInfoController extends BaseController{
	
	private String prefix = "gen/trainingInfo";
	
	@Autowired
	private TrainingInfoService trainingInfoService;

	@Autowired
	private TrainInfoService trainInfoService;

	
	/**
	 * 训练信息管理页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:trainingInfo:view")
    public String view(ModelMap model)
    {
        return prefix + "/list";
    }
	
	/**
	 * list集合
	 * @param tablepar
	 * @param searchText
	 * @return
	 */
	//@Log(title = "训练信息管理", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:trainingInfo:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,TrainingInfo trainingInfo){
		PageInfo<TrainingInfo> page=trainingInfoService.list(tablepar,trainingInfo) ; 
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {

        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "训练信息管理新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:trainingInfo:add")
	@ResponseBody
	public AjaxResult add(TrainingInfo trainingInfo){
		int b=trainingInfoService.insertSelective(trainingInfo);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 训练信息管理删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "训练信息管理删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:trainingInfo:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=trainingInfoService.deleteByPrimaryKey(ids);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	
	/**
	 * 修改跳转
	 * @param id
	 * @param mmap
	 * @return
	 */
	@ApiOperation(value = "修改跳转", notes = "修改跳转")
	@GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap map)
    {
        map.put("TrainingInfo", trainingInfoService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "训练信息管理修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:trainingInfo:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TrainingInfo trainingInfo)
    {
        return toAjax(trainingInfoService.updateByPrimaryKeySelective(trainingInfo));
    }

	/**
	 * 修改保存
	 */
	//@Log(title = "训练信息管理修改", action = "111")
	@ApiOperation(value = "获得数据", notes = "获得数据")
	@SaCheckPermission("gen:trainingInfo:edit")
	@PutMapping("/get")
	@ResponseBody
	public AjaxResult getData(@RequestBody Map<String,Object> mapData)
	{
		String trianStime = (String) mapData.get("trainStarttime");
		String trianEtime = (String) mapData.get("trainEndtime");
		Date startDate = DateUtils.dateTime(DateUtils.DATE_TIME_PATTERN,trianStime);
		Date endDate = DateUtils.dateTime(DateUtils.DATE_TIME_PATTERN,trianEtime);
		System.out.println("****************************"+trianStime);
		System.out.println("****************************"+trianEtime);

		List<Machine> machineList = trainingInfoService.getMachine(startDate,endDate);
		List<Student> studentList = trainingInfoService.getStudent(startDate,endDate);
		List<Teacher> teacherList = trainingInfoService.getTeacher(startDate,endDate);
		List<TrainInfo> trainInfoList = trainInfoService.selectByExample(null);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("machineList",machineList);
		jsonObject.put("studentList",studentList);
		jsonObject.put("teacherList",teacherList);
		jsonObject.put("trainInfoList",trainInfoList);
		return retobject(200,jsonObject);
	}

    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody TrainingInfo trainingInfo){
		int i=trainingInfoService.updateVisible(trainingInfo);
		return toAjax(i);
	}

    
    

	
}
