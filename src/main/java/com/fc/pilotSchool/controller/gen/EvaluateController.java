package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.auto.Student;
import com.fc.pilotSchool.model.auto.Teacher;
import com.fc.pilotSchool.model.auto.TsysUser;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.Evaluate;
import com.fc.pilotSchool.satoken.SaTokenUtil;
import com.fc.pilotSchool.service.EvaluateService;
import com.fc.pilotSchool.service.StudentService;
import com.fc.pilotSchool.service.TeacherService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 评价表Controller
 * @ClassName: EvaluateController
 * @author fuce
 * @date 2023-05-10 20:42:39
 */
@Api(value = "评价表")
@Controller
@RequestMapping("/EvaluateController")
public class EvaluateController extends BaseController{
	
	private String prefix = "gen/evaluate";
	
	@Autowired
	private EvaluateService evaluateService;

	@Autowired
	private StudentService studentService;

	@Autowired
	private TeacherService teacherService;

	/**
	 * 评价表页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:evaluate:view")
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
	//@Log(title = "评价表", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:evaluate:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Evaluate evaluate){
		TsysUser tsysUser = SaTokenUtil.getUser();
		String id = null;
		if (tsysUser.getUsername().startsWith("S")){
			id = tsysUser.getUsername();
		}
		if (tsysUser.getUsername().startsWith("T")){
			id = tsysUser.getUsername();
		}
		evaluate.setTargetId(id);
		PageInfo<Evaluate> page=evaluateService.list(tablepar,evaluate);
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
		TsysUser tsysUser = SaTokenUtil.getUser();
		if (tsysUser.getUsername().startsWith("S")){
			List<Teacher> teacherList = teacherService.selectByExample(null);
			modelMap.put("list",teacherList);
		}
		if (tsysUser.getUsername().startsWith("T")){
			List<Student> studentList = studentService.selectByExample(null);
			modelMap.put("list",studentList);
		}
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "评价表新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:evaluate:add")
	@ResponseBody
	public AjaxResult add(Evaluate evaluate){

		TsysUser tsysUser = SaTokenUtil.getUser();
		evaluate.setUserId(tsysUser.getUsername());
		if (tsysUser.getUsername().startsWith("S")){
			evaluate.setTargetId(teacherService.selectByPrimaryKey(evaluate.getTargetId()).getUsername());
		}
		if (tsysUser.getUsername().startsWith("T")){
			evaluate.setTargetId(studentService.selectByPrimaryKey(evaluate.getTargetId()).getUsername());
		}
		int b=evaluateService.insertSelective(evaluate);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 评价表删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "评价表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:evaluate:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=evaluateService.deleteByPrimaryKey(ids);
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
        map.put("Evaluate", evaluateService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "评价表修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:evaluate:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Evaluate evaluate)
    {
        return toAjax(evaluateService.updateByPrimaryKeySelective(evaluate));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Evaluate evaluate){
		int i=evaluateService.updateVisible(evaluate);
		return toAjax(i);
	}

    
    

	
}
