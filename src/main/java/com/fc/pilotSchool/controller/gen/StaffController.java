package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.auto.TsysRole;
import com.fc.pilotSchool.model.auto.TsysRoleExample;
import com.fc.pilotSchool.model.auto.TsysUser;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.Staff;
import com.fc.pilotSchool.service.StaffService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 工作人员Controller
 * @ClassName: StaffController
 * @author fuce
 * @date 2023-05-08 18:48:01
 */
@Api(value = "工作人员")
@Controller
@RequestMapping("/StaffController")
public class StaffController extends BaseController{
	
	private String prefix = "gen/staff";
	
	@Autowired
	private StaffService staffService;
	
	
	/**
	 * 工作人员页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:staff:view")
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
	//@Log(title = "工作人员", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:staff:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Staff staff){
		PageInfo<Staff> page=staffService.list(tablepar,staff) ; 
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
	//@Log(title = "工作人员新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:staff:add")
	@ResponseBody
	public AjaxResult add(Staff staff){
		staff.setUsername("F"+staff.getUsername());
		TsysUser tsysUser = new TsysUser();
		tsysUser.setPassword(staff.getPwd());
		tsysUser.setUsername(staff.getUsername());
		tsysUser.setNickname(staff.getTrueName());
		TsysRoleExample tsysRoleExample = new TsysRoleExample();
		tsysRoleExample.createCriteria().andNameEqualTo("工作人员");
		List<TsysRole> tsysRoles = sysRoleService.selectByExample(tsysRoleExample);
		int c=sysUserService.insertUserRoles(tsysUser,tsysRoles.get(0).getId());
		int b=staffService.insertSelective(staff);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 工作人员删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "工作人员删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:staff:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=staffService.deleteByPrimaryKey(ids);
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
        map.put("Staff", staffService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "工作人员修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:staff:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Staff staff)
    {
        return toAjax(staffService.updateByPrimaryKeySelective(staff));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Staff staff){
		int i=staffService.updateVisible(staff);
		return toAjax(i);
	}

    
    

	
}
