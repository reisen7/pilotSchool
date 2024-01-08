package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.TrainCategory;
import com.fc.pilotSchool.service.TrainCategoryService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 培训类别Controller
 * @ClassName: TrainCategoryController
 * @author fuce
 * @date 2023-05-13 20:37:10
 */
@Api(value = "培训类别")
@Controller
@RequestMapping("/TrainCategoryController")
public class TrainCategoryController extends BaseController{
	
	private String prefix = "gen/trainCategory";
	
	@Autowired
	private TrainCategoryService trainCategoryService;
	
	
	/**
	 * 培训类别页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:trainCategory:view")
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
	//@Log(title = "培训类别", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:trainCategory:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,TrainCategory trainCategory){
		PageInfo<TrainCategory> page=trainCategoryService.list(tablepar,trainCategory) ; 
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
	//@Log(title = "培训类别新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:trainCategory:add")
	@ResponseBody
	public AjaxResult add(TrainCategory trainCategory){
		int b=trainCategoryService.insertSelective(trainCategory);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 培训类别删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "培训类别删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:trainCategory:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=trainCategoryService.deleteByPrimaryKey(ids);
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
        map.put("TrainCategory", trainCategoryService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "培训类别修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:trainCategory:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TrainCategory trainCategory)
    {
        return toAjax(trainCategoryService.updateByPrimaryKeySelective(trainCategory));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody TrainCategory trainCategory){
		int i=trainCategoryService.updateVisible(trainCategory);
		return toAjax(i);
	}

    
    

	
}
