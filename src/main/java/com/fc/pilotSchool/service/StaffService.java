package com.fc.pilotSchool.service;

import java.util.List;

import com.fc.pilotSchool.model.auto.Teacher;
import com.fc.pilotSchool.model.auto.TeacherExample;
import com.fc.pilotSchool.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.StaffMapper;
import com.fc.pilotSchool.model.auto.Staff;
import com.fc.pilotSchool.model.auto.StaffExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 工作人员 StaffService
 * @Title: StaffService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-08 18:48:01  
 **/
@Service
public class StaffService implements BaseService<Staff, StaffExample>{
	@Autowired
	private StaffMapper staffMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Staff> list(Tablepar tablepar,Staff staff){
	        StaffExample testExample=new StaffExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(staff);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Staff> list= staffMapper.selectByExample(testExample);
	        PageInfo<Staff> pageInfo = new PageInfo<Staff>(list);
	        return  pageInfo;
	 }

	public Staff selectByUsername(String username) {
		StaffExample staffExample = new StaffExample();
		if (username != null && !username.equals("")){
			staffExample.createCriteria().andUsernameEqualTo(username);
		}
		return staffMapper.selectByExample(staffExample).get(0);
	}

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			StaffExample example=new StaffExample();
			example.createCriteria().andIdIn(lista);
			return staffMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Staff selectByPrimaryKey(String id) {
		
			return staffMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Staff record) {
		return staffMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Staff record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());

		record.setPwd(MD5Util.encode(record.getPwd()));
		return staffMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Staff record, StaffExample example) {
		
		return staffMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Staff record, StaffExample example) {
		
		return staffMapper.updateByExample(record, example);
	}

	@Override
	public List<Staff> selectByExample(StaffExample example) {
		
		return staffMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(StaffExample example) {
		
		return staffMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(StaffExample example) {
		
		return staffMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param staff
	 * @return
	 */
	public int updateVisible(Staff staff) {
		return staffMapper.updateByPrimaryKeySelective(staff);
	}


}
