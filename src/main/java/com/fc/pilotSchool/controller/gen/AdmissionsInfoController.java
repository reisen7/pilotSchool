package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.AdmissionsInfo;
import com.fc.pilotSchool.service.AdmissionsInfoService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 招生信息Controller
 * @ClassName: AdmissionsInfoController
 * @author fuce
 * @date 2023-05-13 22:15:47
 */
@Api(value = "招生信息")
@Controller
@RequestMapping("/AdmissionsInfoController")
public class AdmissionsInfoController extends BaseController{
	
	private String prefix = "gen/admissionsInfo";
	
	@Autowired
	private AdmissionsInfoService admissionsInfoService;
	
	
	/**
	 * 招生信息页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:admissionsInfo:view")
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
	//@Log(title = "招生信息", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:admissionsInfo:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,AdmissionsInfo admissionsInfo){
		PageInfo<AdmissionsInfo> page=admissionsInfoService.list(tablepar,admissionsInfo) ; 
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
	//@Log(title = "招生信息新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:admissionsInfo:add")
	@ResponseBody
	public AjaxResult add(AdmissionsInfo admissionsInfo){
		int b=admissionsInfoService.insertSelective(admissionsInfo);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 招生信息删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "招生信息删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:admissionsInfo:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=admissionsInfoService.deleteByPrimaryKey(ids);
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
        map.put("AdmissionsInfo", admissionsInfoService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "招生信息修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:admissionsInfo:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AdmissionsInfo admissionsInfo)
    {
        return toAjax(admissionsInfoService.updateByPrimaryKeySelective(admissionsInfo));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody AdmissionsInfo admissionsInfo){
		int i=admissionsInfoService.updateVisible(admissionsInfo);
		return toAjax(i);
	}

    
    

	
}
