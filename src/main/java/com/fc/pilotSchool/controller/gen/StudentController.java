package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.auto.TsysRole;
import com.fc.pilotSchool.model.auto.TsysRoleExample;
import com.fc.pilotSchool.model.auto.TsysUser;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.Student;
import com.fc.pilotSchool.satoken.SaTokenUtil;
import com.fc.pilotSchool.service.StudentService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.fc.pilotSchool.common.conf.oss.OssConfig;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 学生Controller
 * @ClassName: StudentController
 * @author fuce
 * @date 2023-05-31 14:28:59
 */
@Api(value = "学生")
@Controller
@RequestMapping("/StudentController")
public class StudentController extends BaseController{
	
	private String prefix = "gen/student";
	
	@Autowired
	private StudentService studentService;
	
	
	/**
	 * 学生页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:student:view")
    @OssConfig
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
	//@Log(title = "学生", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:student:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar, Student student){
		TsysUser tsysUser = SaTokenUtil.getUser();
		if (tsysUser.getUsername().startsWith("S")){
			Student Currstudent = new Student();
			Currstudent.setUsername(tsysUser.getUsername());
			student = Currstudent;
		}
		PageInfo<Student> page=studentService.list(tablepar,student) ;
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    @OssConfig
    public String add(ModelMap modelMap)
    {
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "学生新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:student:add")
	@ResponseBody
	public AjaxResult add(Student student){
		student.setUsername("S"+student.getUsername());
		TsysUser tsysUser = new TsysUser();
		tsysUser.setPassword(student.getPwd());
		tsysUser.setUsername(student.getUsername());
		tsysUser.setNickname(student.getTrueName());
		TsysRoleExample tsysRoleExample = new TsysRoleExample();
		tsysRoleExample.createCriteria().andNameEqualTo("学生");
		List<TsysRole> tsysRoles = sysRoleService.selectByExample(tsysRoleExample);
		int c=sysUserService.insertUserRoles(tsysUser,tsysRoles.get(0).getId());
		int b=studentService.insertSelective(student);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 学生删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "学生删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:student:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=studentService.deleteByPrimaryKey(ids);
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
    @OssConfig
    public String edit(@PathVariable("id") String id, ModelMap map)
    {
        map.put("Student", studentService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "学生修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:student:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Student student)
    {
        return toAjax(studentService.updateByPrimaryKeySelective(student));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Student student){
		int i=studentService.updateVisible(student);
		return toAjax(i);
	}

    
    

	
}
