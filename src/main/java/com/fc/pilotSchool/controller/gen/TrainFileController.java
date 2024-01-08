package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.auto.TsysUser;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.TrainFile;
import com.fc.pilotSchool.satoken.SaTokenUtil;
import com.fc.pilotSchool.service.TrainFileService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.fc.pilotSchool.common.conf.oss.OssConfig;

import java.util.Date;

/**
 * 资料管理Controller
 * @ClassName: TrainFileController
 * @author fuce
 * @date 2023-06-02 15:16:38
 */
@Api(value = "资料管理")
@Controller
@RequestMapping("/TrainFileController")
public class TrainFileController extends BaseController{
	
	private String prefix = "gen/trainFile";
	
	@Autowired
	private TrainFileService trainFileService;
	
	
	/**
	 * 资料管理页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:trainFile:view")
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
	//@Log(title = "资料管理", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:trainFile:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,TrainFile trainFile){
		PageInfo<TrainFile> page=trainFileService.list(tablepar,trainFile) ; 
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
	//@Log(title = "资料管理新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:trainFile:add")
	@ResponseBody
	public AjaxResult add(TrainFile trainFile){
		TsysUser tsysUser = SaTokenUtil.getUser();
		trainFile.setUploadName(tsysUser.getUsername());
		trainFile.setUploadDate(new Date());
		int b=trainFileService.insertSelective(trainFile);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 资料管理删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "资料管理删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:trainFile:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=trainFileService.deleteByPrimaryKey(ids);
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
        map.put("TrainFile", trainFileService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "资料管理修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:trainFile:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TrainFile trainFile)
    {
		TsysUser tsysUser = SaTokenUtil.getUser();
		trainFile.setUploadName(tsysUser.getUsername());
		trainFile.setUploadDate(new Date());
        return toAjax(trainFileService.updateByPrimaryKeySelective(trainFile));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody TrainFile trainFile){
		int i=trainFileService.updateVisible(trainFile);
		return toAjax(i);
	}

    
    

	
}
