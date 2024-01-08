package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.auto.PExperience;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.FlyExperience;
import com.fc.pilotSchool.service.FlyExperienceService;
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
 * 飞行体验活动管理Controller
 * @ClassName: FlyExperienceController
 * @author fuce
 * @date 2023-05-10 19:49:37
 */
@Api(value = "飞行体验活动管理")
@Controller
@RequestMapping("/FlyExperienceController")
public class FlyExperienceController extends BaseController{
	
	private String prefix = "gen/flyExperience";
	
	@Autowired
	private FlyExperienceService flyExperienceService;

	@Autowired
	private PExperienceService pExperienceService;
	
	
	/**
	 * 飞行体验活动管理页面展示
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
	//@Log(title = "飞行体验活动管理", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:flyExperience:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,FlyExperience flyExperience){
		PageInfo<FlyExperience> page=flyExperienceService.list(tablepar,flyExperience) ; 
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
	//@Log(title = "飞行体验活动管理新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:flyExperience:add")
	@ResponseBody
	public AjaxResult add(FlyExperience flyExperience){
		int b=flyExperienceService.insertSelective(flyExperience);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 飞行体验活动管理删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "飞行体验活动管理删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:flyExperience:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=flyExperienceService.deleteByPrimaryKey(ids);
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
        map.put("FlyExperience", flyExperienceService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }


	/**
	 * 添加跳转
	 * @param id
	 * @param mmap
	 * @return
	 */
	@ApiOperation(value = "修改跳转", notes = "修改跳转")
	@GetMapping("/addPerson/{id}")
	public String addPerson(@PathVariable("id") String id, ModelMap map)
	{
		map.put("experienceid",id);
		System.out.println(id);
		return prefix + "/addperson";
	}

	/**
     * 修改保存
     */
    //@Log(title = "飞行体验活动管理修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:flyExperience:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FlyExperience flyExperience)
    {
        return toAjax(flyExperienceService.updateByPrimaryKeySelective(flyExperience));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody FlyExperience flyExperience){
		int i=flyExperienceService.updateVisible(flyExperience);
		return toAjax(i);
	}

    
    

	
}
