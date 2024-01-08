package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.auto.Machine;
import com.fc.pilotSchool.model.auto.Staff;
import com.fc.pilotSchool.model.auto.TsysUser;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.Facility;
import com.fc.pilotSchool.satoken.SaTokenUtil;
import com.fc.pilotSchool.service.FacilityService;
import com.fc.pilotSchool.service.StaffService;
import com.github.pagehelper.PageInfo;
import com.sun.jna.platform.win32.ObjBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 设施Controller
 * @ClassName: FacilityController
 * @author fuce
 * @date 2023-05-10 14:23:27
 */
@Api(value = "设施")
@Controller
@RequestMapping("/FacilityController")
public class FacilityController extends BaseController{
	
	private String prefix = "gen/facility";
	
	@Autowired
	private FacilityService facilityService;

	@Autowired
	private StaffService staffService;
	
	/**
	 * 设施页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:facility:view")
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
	//@Log(title = "设施", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:facility:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Facility facility){
		TsysUser tsysUser = SaTokenUtil.getUser();
		if (tsysUser.getUsername().startsWith("F")){
			facility.setFacilityMaster(staffService.selectByUsername(tsysUser.getUsername()).getId());
		}
		PageInfo<Facility> page=facilityService.list(tablepar,facility);
		List<Facility> list = page.getList();
		list.forEach(x->{
			x.setFacilityMaster(staffService.selectByPrimaryKey(x.getFacilityMaster()).getTrueName());
		});
		return pageTable(list,page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap, Map<String, Object> map)
    {
		List<Staff> staffList = staffService.selectByExample(null);
		map.put("staffList",staffList);
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "设施新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:facility:add")
	@ResponseBody
	public AjaxResult add(Facility facility){
		int b=facilityService.insertSelective(facility);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 设施删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "设施删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:facility:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=facilityService.deleteByPrimaryKey(ids);
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
		List<Staff> staffList = staffService.selectByExample(null);
		map.put("staffList",staffList);
        map.put("Facility", facilityService.selectByPrimaryKey(id));
		TsysUser tsysUser = SaTokenUtil.getUser();
		if (tsysUser.getUsername().startsWith("F")){
			map.put("isStaff",1);
		}else{
			map.put("isStaff",0);
		}
        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "设施修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:facility:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Facility facility)
    {
        return toAjax(facilityService.updateByPrimaryKeySelective(facility));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Facility facility){
		int i=facilityService.updateVisible(facility);
		return toAjax(i);
	}

    
    

	
}
