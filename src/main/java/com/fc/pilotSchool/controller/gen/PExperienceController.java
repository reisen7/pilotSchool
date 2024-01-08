package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.PExperience;
import com.fc.pilotSchool.service.PExperienceService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 飞行体验活动管理人员表Controller
 * @ClassName: PExperienceController
 * @author fuce
 * @date 2023-06-03 11:55:05
 */
@Api(value = "飞行体验活动管理人员表")
@Controller
@RequestMapping("/PExperienceController")
public class PExperienceController extends BaseController{
	
	private String prefix = "gen/pExperience";
	
	@Autowired
	private PExperienceService pExperienceService;
	
	
	/**
	 * 飞行体验活动管理人员表页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:flyExperience:view")
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
	//@Log(title = "飞行体验活动管理人员表", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list/{e_id}")
	@SaCheckPermission("gen:flyExperience:list")
	@ResponseBody
	public ResultTable list(@PathVariable("e_id") String e_id,Tablepar tablepar,PExperience pExperience){
		pExperience.setExperienceId(e_id);
		PageInfo<PExperience> page=pExperienceService.list(tablepar,pExperience) ; 
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
	//@Log(title = "飞行体验活动管理人员表新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add/{e_id}")
	@SaCheckPermission("gen:flyExperience:add")
	@ResponseBody
	public AjaxResult add(@PathVariable("e_id") String id, PExperience pExperience){
		pExperience.setExperienceId(id);
		int b=pExperienceService.insertSelective(pExperience);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 飞行体验活动管理人员表删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "飞行体验活动管理人员表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:flyExperience:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=pExperienceService.deleteByPrimaryKey(ids);
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
        map.put("PExperience", pExperienceService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "飞行体验活动管理人员表修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:flyExperience:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PExperience pExperience)
    {
        return toAjax(pExperienceService.updateByPrimaryKeySelective(pExperience));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody PExperience pExperience){
		int i=pExperienceService.updateVisible(pExperience);
		return toAjax(i);
	}

    
    

	
}
