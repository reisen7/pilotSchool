package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.License;
import com.fc.pilotSchool.service.LicenseService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 执照表Controller
 * @ClassName: LicenseController
 * @author fuce
 * @date 2023-05-10 20:44:30
 */
@Api(value = "执照表")
@Controller
@RequestMapping("/LicenseController")
public class LicenseController extends BaseController{
	
	private String prefix = "gen/license";
	
	@Autowired
	private LicenseService licenseService;
	
	
	/**
	 * 执照表页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:license:view")
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
	//@Log(title = "执照表", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:license:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,License license){
		PageInfo<License> page=licenseService.list(tablepar,license) ; 
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
	//@Log(title = "执照表新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:license:add")
	@ResponseBody
	public AjaxResult add(License license){
		int b=licenseService.insertSelective(license);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 执照表删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "执照表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:license:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=licenseService.deleteByPrimaryKey(ids);
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
        map.put("License", licenseService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "执照表修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:license:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(License license)
    {
        return toAjax(licenseService.updateByPrimaryKeySelective(license));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody License license){
		int i=licenseService.updateVisible(license);
		return toAjax(i);
	}

    
    

	
}
