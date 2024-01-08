package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.auto.Course;
import com.fc.pilotSchool.model.auto.Student;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.Grades;
import com.fc.pilotSchool.service.CourseService;
import com.fc.pilotSchool.service.GradesService;
import com.fc.pilotSchool.service.StudentService;
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
 * 成绩详细表Controller
 * @ClassName: GradesController
 * @author fuce
 * @date 2023-05-10 20:42:15
 */
@Api(value = "成绩详细表")
@Controller
@RequestMapping("/GradesController")
public class GradesController extends BaseController{
	
	private String prefix = "gen/grades";
	
	@Autowired
	private GradesService gradesService;

	@Autowired
	private StudentService studentService;

	@Autowired
	private CourseService courseService;
	
	
	/**
	 * 成绩详细表页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:grades:view")
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
	//@Log(title = "成绩详细表", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:grades:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Grades grades){
		PageInfo<Grades> page=gradesService.list(tablepar,grades) ; 
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
    	List<Student> studentList = studentService.selectByExample(null);
    	List<Course> courseList = courseService.selectByExample(null);
    	modelMap.put("studentList",studentList);
    	modelMap.put("courseList",courseList);
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "成绩详细表新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:grades:add")
	@ResponseBody
	public AjaxResult add(Grades grades){
		int b=gradesService.insertSelective(grades);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 成绩详细表删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "成绩详细表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:grades:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=gradesService.deleteByPrimaryKey(ids);
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
		List<Student> studentList = studentService.selectByExample(null);
		List<Course> courseList = courseService.selectByExample(null);
		map.put("studentList",studentList);
		map.put("courseList",courseList);
        map.put("Grades", gradesService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "成绩详细表修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:grades:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Grades grades)
    {
        return toAjax(gradesService.updateByPrimaryKeySelective(grades));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Grades grades){
		int i=gradesService.updateVisible(grades);
		return toAjax(i);
	}

    
    

	
}
