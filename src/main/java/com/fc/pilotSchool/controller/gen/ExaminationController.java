package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.auto.Course;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.Examination;
import com.fc.pilotSchool.service.CourseService;
import com.fc.pilotSchool.service.ExaminationService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 考试管理表Controller
 * @ClassName: ExaminationController
 * @author fuce
 * @date 2023-05-10 21:53:08
 */
@Api(value = "考试管理表")
@Controller
@RequestMapping("/ExaminationController")
public class ExaminationController extends BaseController{
	
	private String prefix = "gen/examination";
	
	@Autowired
	private ExaminationService examinationService;

	@Autowired
	private CourseService courseService;
	
	/**
	 * 考试管理表页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:examination:view")
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
	//@Log(title = "考试管理表", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:examination:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Examination examination){
		PageInfo<Examination> page=examinationService.list(tablepar,examination);
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
    	List<Course> courseList = courseService.selectByExample(null);
    	List<Examination> examinations = examinationService.selectByExample(null);
    	List<Course> courses = new ArrayList<>();
    	for (int i=0;i<courseList.size();i++){
    		int flag = 0;
    		for (int j=0;j<examinations.size();j++){
    			if (courseList.get(i).getCId().equals(examinations.get(j).getCoueseId())){
    				flag=1;
				}
			}
    		if (flag==0){
    			courses.add(courseList.get(i));
			}
		}
    	modelMap.put("courseList",courses);
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "考试管理表新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:examination:add")
	@ResponseBody
	public AjaxResult add(Examination examination){
		int b=examinationService.insertSelective(examination);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 考试管理表删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "考试管理表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:examination:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=examinationService.deleteByPrimaryKey(ids);
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
		List<Course> courseList = courseService.selectByExample(null);
		List<Examination> examinations = examinationService.selectByExample(null);
		List<Course> courses = new ArrayList<>();
		for (int i=0;i<courseList.size();i++){
			int flag = 0;
			for (int j=0;j<examinations.size();j++){
				if (courseList.get(i).getCId().equals(examinations.get(j).getCoueseId())){
					flag=1;
				}
			}
			if (flag==0){
				courses.add(courseList.get(i));
			}
		}
		map.put("courseList",courses);
        map.put("Examination", examinationService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "考试管理表修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:examination:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Examination examination)
    {
        return toAjax(examinationService.updateByPrimaryKeySelective(examination));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Examination examination){
		int i=examinationService.updateVisible(examination);
		return toAjax(i);
	}

    
    

	
}
