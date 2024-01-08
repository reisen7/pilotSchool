package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.Studenjob;
import com.fc.pilotSchool.service.StudenjobService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 工作信息表Controller
 * @ClassName: StudenjobController
 * @author fuce
 * @date 2023-05-10 10:58:07
 */
@Api(value = "工作信息表")
@Controller
@RequestMapping("/StudenjobController")
public class StudenjobController extends BaseController{
	
	private String prefix = "gen/studenjob";
	
	@Autowired
	private StudenjobService studenjobService;
	
	
	/**
	 * 工作信息表页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:studenjob:view")
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
	//@Log(title = "工作信息表", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:studenjob:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Studenjob studenjob){
		PageInfo<Studenjob> page=studenjobService.list(tablepar,studenjob) ; 
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
	//@Log(title = "工作信息表新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:studenjob:add")
	@ResponseBody
	public AjaxResult add(Studenjob studenjob){
		int b=studenjobService.insertSelective(studenjob);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 工作信息表删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "工作信息表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:studenjob:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=studenjobService.deleteByPrimaryKey(ids);
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
        map.put("Studenjob", studenjobService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "工作信息表修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:studenjob:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Studenjob studenjob)
    {
        return toAjax(studenjobService.updateByPrimaryKeySelective(studenjob));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Studenjob studenjob){
		int i=studenjobService.updateVisible(studenjob);
		return toAjax(i);
	}

    
    

	
}
