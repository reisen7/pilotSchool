package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.auto.Facility;
import com.fc.pilotSchool.model.auto.Teacher;
import com.fc.pilotSchool.model.auto.TrainInfo;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.Course;
import com.fc.pilotSchool.service.CourseService;
import com.fc.pilotSchool.service.FacilityService;
import com.fc.pilotSchool.service.TeacherService;
import com.fc.pilotSchool.service.TrainInfoService;
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
 * 课程信息Controller
 * @ClassName: CourseController
 * @author fuce
 * @date 2023-05-10 21:48:17
 */
@Api(value = "课程信息")
@Controller
@RequestMapping("/CourseController")
public class CourseController extends BaseController{
	
	private String prefix = "gen/course";
	
	@Autowired
	private CourseService courseService;

	@Autowired
	private TeacherService teacherService;

	@Autowired
	private FacilityService facilityService;

	@Autowired
	private TrainInfoService trainInfoService;
	
	/**
	 * 课程信息页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:course:view")
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
	//@Log(title = "课程信息", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:course:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Course course){
		PageInfo<Course> page=courseService.list(tablepar,course) ; 
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
    	List<Teacher> teacherList = teacherService.selectByExample(null);
    	List<Facility> facilityList = facilityService.selectByExample(null);
    	List<TrainInfo> trainInfoList = trainInfoService.selectByExample(null);
    	modelMap.put("teacherList",teacherList);
    	modelMap.put("facilityList",facilityList);
    	modelMap.put("trainInfoList",trainInfoList);
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "课程信息新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:course:add")
	@ResponseBody
	public AjaxResult add(Course course){
		int b=courseService.insertSelective(course);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 课程信息删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "课程信息删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:course:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=courseService.deleteByPrimaryKey(ids);
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
		List<Teacher> teacherList = teacherService.selectByExample(null);
		List<Facility> facilityList = facilityService.selectByExample(null);
		List<TrainInfo> trainInfoList = trainInfoService.selectByExample(null);
		map.put("teacherList",teacherList);
		map.put("facilityList",facilityList);
		map.put("trainInfoList",trainInfoList);
        map.put("Course", courseService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "课程信息修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:course:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Course course)
    {
        return toAjax(courseService.updateByPrimaryKeySelective(course));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Course course){
		int i=courseService.updateVisible(course);
		return toAjax(i);
	}

    
    

	
}
