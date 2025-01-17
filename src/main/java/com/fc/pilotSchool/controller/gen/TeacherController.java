package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.auto.TsysRole;
import com.fc.pilotSchool.model.auto.TsysRoleExample;
import com.fc.pilotSchool.model.auto.TsysUser;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.Teacher;
import com.fc.pilotSchool.service.TeacherService;
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
 * 教练表Controller
 * @ClassName: TeacherController
 * @author fuce
 * @date 2023-05-08 18:33:22
 */
@Api(value = "教练表")
@Controller
@RequestMapping("/TeacherController")
public class TeacherController extends BaseController{
	
	private String prefix = "gen/teacher";
	
	@Autowired
	private TeacherService teacherService;
	
	
	/**
	 * 教练表页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:teacher:view")
    public String view(ModelMap model)
    {
        return prefix + "/list";
    }
	
	/**
	 * list集合
	 * @param tablepar
	 * @param
	 * @return
	 */
	//@Log(title = "教练表", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:teacher:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Teacher teacher){
		PageInfo<Teacher> page=teacherService.list(tablepar,teacher) ; 
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
	//@Log(title = "教练表新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:teacher:add")
	@ResponseBody
	public AjaxResult add(Teacher teacher){
		teacher.setUsername("T"+teacher.getUsername());
		TsysUser tsysUser = new TsysUser();
		tsysUser.setPassword(teacher.getPwd());
		tsysUser.setUsername(teacher.getUsername());
		tsysUser.setNickname(teacher.getTrueName());
		TsysRoleExample tsysRoleExample = new TsysRoleExample();
		tsysRoleExample.createCriteria().andNameEqualTo("教练");
		List<TsysRole> tsysRoles = sysRoleService.selectByExample(tsysRoleExample);
		int c=sysUserService.insertUserRoles(tsysUser,tsysRoles.get(0).getId());
		int b=teacherService.insertSelective(teacher);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 教练表删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "教练表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:teacher:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=teacherService.deleteByPrimaryKey(ids);
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
        map.put("Teacher", teacherService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "教练表修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:teacher:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Teacher teacher)
    {
        return toAjax(teacherService.updateByPrimaryKeySelective(teacher));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Teacher teacher){
		int i=teacherService.updateVisible(teacher);
		return toAjax(i);
	}

    
    

	
}
