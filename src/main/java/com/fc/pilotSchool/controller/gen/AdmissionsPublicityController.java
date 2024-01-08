package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.AdmissionsPublicity;
import com.fc.pilotSchool.service.AdmissionsPublicityService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 招生宣传Controller
 * @ClassName: AdmissionsPublicityController
 * @author fuce
 * @date 2023-05-10 10:19:40
 */
@Api(value = "招生宣传")
@Controller
@RequestMapping("/AdmissionsPublicityController")
public class AdmissionsPublicityController extends BaseController{
	
	private String prefix = "gen/admissionsPublicity";
	
	@Autowired
	private AdmissionsPublicityService admissionsPublicityService;
	
	
	/**
	 * 招生宣传页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:admissionsPublicity:view")
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
	//@Log(title = "招生宣传", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:admissionsPublicity:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,AdmissionsPublicity admissionsPublicity){
		PageInfo<AdmissionsPublicity> page=admissionsPublicityService.list(tablepar,admissionsPublicity) ; 
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
	//@Log(title = "招生宣传新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:admissionsPublicity:add")
	@ResponseBody
	public AjaxResult add(AdmissionsPublicity admissionsPublicity){
		int b=admissionsPublicityService.insertSelective(admissionsPublicity);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 招生宣传删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "招生宣传删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:admissionsPublicity:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=admissionsPublicityService.deleteByPrimaryKey(ids);
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
        map.put("AdmissionsPublicity", admissionsPublicityService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "招生宣传修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:admissionsPublicity:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AdmissionsPublicity admissionsPublicity)
    {
        return toAjax(admissionsPublicityService.updateByPrimaryKeySelective(admissionsPublicity));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody AdmissionsPublicity admissionsPublicity){
		int i=admissionsPublicityService.updateVisible(admissionsPublicity);
		return toAjax(i);
	}

    
    

	
}
