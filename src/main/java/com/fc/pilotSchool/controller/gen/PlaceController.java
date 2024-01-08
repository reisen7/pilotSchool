package com.fc.pilotSchool.controller.gen;

import com.fc.pilotSchool.common.base.BaseController;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.common.domain.ResultTable;
import com.fc.pilotSchool.model.auto.Staff;
import com.fc.pilotSchool.model.auto.TsysUser;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.model.auto.Place;
import com.fc.pilotSchool.satoken.SaTokenUtil;
import com.fc.pilotSchool.service.PlaceService;
import com.fc.pilotSchool.service.StaffService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 场地Controller
 * @ClassName: PlaceController
 * @author fuce
 * @date 2023-05-10 14:21:55
 */
@Api(value = "场地")
@Controller
@RequestMapping("/PlaceController")
public class PlaceController extends BaseController{
	
	private String prefix = "gen/place";
	
	@Autowired
	private PlaceService placeService;

	@Autowired
	private StaffService staffService;
	
	
	/**
	 * 场地页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("gen:place:view")
    public String view(ModelMap model)
    {
        return prefix + "/list";
    }
	
	/**
	 * list集合
	 * @param tablepar
	 * @param
	 * @return
	 */
	//@Log(title = "场地", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@SaCheckPermission("gen:place:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Place place){
		TsysUser tsysUser = SaTokenUtil.getUser();
		if (tsysUser.getUsername().startsWith("F")){
			place.setPlaceMaster(staffService.selectByUsername(tsysUser.getUsername()).getId());
		}
		PageInfo<Place> page=placeService.list(tablepar,place) ;
		List<Place> list = page.getList();
		list.forEach(x->{
			x.setPlaceMaster(staffService.selectByPrimaryKey(x.getPlaceMaster()).getTrueName());
		});

		return pageTable(list,page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap, Map<String,Object> map)
    {
    	List<Staff> staffList = staffService.selectByExample(null);
    	map.put("staffList",staffList);
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "场地新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@SaCheckPermission("gen:place:add")
	@ResponseBody
	public AjaxResult add(Place place){

		int b=placeService.insertSelective(place);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 场地删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "场地删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("gen:place:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=placeService.deleteByPrimaryKey(ids);
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
		List<Staff> staffList = staffService.selectByExample(null);
		map.put("staffList",staffList);
        map.put("Place", placeService.selectByPrimaryKey(id));
		TsysUser tsysUser = SaTokenUtil.getUser();
		if (tsysUser.getUsername().startsWith("F")){
			map.put("isStaff",1);
		}else{
			map.put("isStaff",0);
		}
        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "场地修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @SaCheckPermission("gen:place:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Place place)
    {
        return toAjax(placeService.updateByPrimaryKeySelective(place));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Place place){
		int i=placeService.updateVisible(place);
		return toAjax(i);
	}

    
    

	
}
