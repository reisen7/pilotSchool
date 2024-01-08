package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.TrainingLog;
import com.fc.pilotSchool.service.TrainingLogService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 训练日志管理Controller
 * @ClassName: TrainingLogController
 * @author fuce
 * @date 2023-05-10 19:47:59
 */
@Api(value = "训练日志管理")
@Controller
@RequestMapping("/TrainingLogController")
public class TrainingLogController extends BaseController{
	
	private String prefix = "gen/trainingLog";
	
	@Autowired
	private TrainingLogService trainingLogService;
	
	
	/**
	 * 训练日志管理页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:trainingLog:view")
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
	//@Log(title = "训练日志管理", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:trainingLog:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,TrainingLog trainingLog){
		PageInfo<TrainingLog> page=trainingLogService.list(tablepar,trainingLog) ; 
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
	//@Log(title = "训练日志管理新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:trainingLog:add")
	@ResponseBody
	public AjaxResult add(TrainingLog trainingLog){
		int b=trainingLogService.insertSelective(trainingLog);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 训练日志管理删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "训练日志管理删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:trainingLog:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=trainingLogService.deleteByPrimaryKey(ids);
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
        map.put("TrainingLog", trainingLogService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "训练日志管理修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:trainingLog:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TrainingLog trainingLog)
    {
        return toAjax(trainingLogService.updateByPrimaryKeySelective(trainingLog));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody TrainingLog trainingLog){
		int i=trainingLogService.updateVisible(trainingLog);
		return toAjax(i);
	}

    
    

	
}
