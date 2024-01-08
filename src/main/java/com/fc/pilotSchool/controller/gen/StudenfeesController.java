package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.Studenfees;
import com.fc.pilotSchool.service.StudenfeesService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 学费Controller
 * @ClassName: StudenfeesController
 * @author fuce
 * @date 2023-05-10 21:02:59
 */
@Api(value = "学费")
@Controller
@RequestMapping("/StudenfeesController")
public class StudenfeesController extends BaseController{
	
	private String prefix = "gen/studenfees";
	
	@Autowired
	private StudenfeesService studenfeesService;
	
	
	/**
	 * 学费页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:studenfees:view")
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
	//@Log(title = "学费", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:studenfees:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Studenfees studenfees){
		PageInfo<Studenfees> page=studenfeesService.list(tablepar,studenfees) ; 
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
	//@Log(title = "学费新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:studenfees:add")
	@ResponseBody
	public AjaxResult add(Studenfees studenfees){
		int b=studenfeesService.insertSelective(studenfees);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 学费删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "学费删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:studenfees:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=studenfeesService.deleteByPrimaryKey(ids);
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
        map.put("Studenfees", studenfeesService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "学费修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:studenfees:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Studenfees studenfees)
    {
        return toAjax(studenfeesService.updateByPrimaryKeySelective(studenfees));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Studenfees studenfees){
		int i=studenfeesService.updateVisible(studenfees);
		return toAjax(i);
	}

    
    

	
}
