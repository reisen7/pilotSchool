package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.auto.Machine;
import com.fc.pilotSchool.model.auto.Place;
import com.fc.pilotSchool.model.auto.TrainCategory;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.TrainInfo;
import com.fc.pilotSchool.service.MachineService;
import com.fc.pilotSchool.service.PlaceService;
import com.fc.pilotSchool.service.TrainCategoryService;
import com.fc.pilotSchool.service.TrainInfoService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 培训信息Controller
 * @ClassName: TrainInfoController
 * @author fuce
 * @date 2023-05-13 20:46:33
 */
@Api(value = "培训信息")
@Controller
@RequestMapping("/TrainInfoController")
public class TrainInfoController extends BaseController{
	
	private String prefix = "gen/trainInfo";
	
	@Autowired
	private TrainInfoService trainInfoService;

	@Autowired
	private PlaceService placeService;

	@Autowired
	private MachineService machineService;

	@Autowired
	private TrainCategoryService trainCategoryService;
	
	/**
	 * 培训信息页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:trainInfo:view")
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
	//@Log(title = "培训信息", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:trainInfo:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,TrainInfo trainInfo){
		PageInfo<TrainInfo> page=trainInfoService.list(tablepar,trainInfo) ; 
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
		List<Place> placeList = placeService.selectByExample(null);
		List<Machine> machineList = machineService.selectByExample(null);
		List<TrainCategory> trainCategories = trainCategoryService.selectByExample(null);
		modelMap.put("placeList",placeList);
		modelMap.put("machineList",machineList);
		modelMap.put("trainCategories",trainCategories);
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "培训信息新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:trainInfo:add")
	@ResponseBody
	public AjaxResult add(TrainInfo trainInfo){

		int b=trainInfoService.insertSelective(trainInfo);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 培训信息删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "培训信息删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:trainInfo:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=trainInfoService.deleteByPrimaryKey(ids);
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
		List<Place> placeList = placeService.selectByExample(null);
		List<Machine> machineList = machineService.selectByExample(null);
		List<TrainCategory> trainCategories = trainCategoryService.selectByExample(null);
		map.put("placeList",placeList);
		map.put("machineList",machineList);
		map.put("trainCategories",trainCategories);
        map.put("TrainInfo", trainInfoService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "培训信息修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:trainInfo:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TrainInfo trainInfo)
    {
        return toAjax(trainInfoService.updateByPrimaryKeySelective(trainInfo));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody TrainInfo trainInfo){
		int i=trainInfoService.updateVisible(trainInfo);
		return toAjax(i);
	}

    
    

	
}
