package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.FacilityMapper;
import com.fc.pilotSchool.model.auto.Facility;
import com.fc.pilotSchool.model.auto.FacilityExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 设施 FacilityService
 * @Title: FacilityService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 14:23:27  
 **/
@Service
public class FacilityService implements BaseService<Facility, FacilityExample>{
	@Autowired
	private FacilityMapper facilityMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Facility> list(Tablepar tablepar,Facility facility){
	        FacilityExample testExample=new FacilityExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(facility);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Facility> list= facilityMapper.selectByExample(testExample);
	        PageInfo<Facility> pageInfo = new PageInfo<Facility>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			FacilityExample example=new FacilityExample();
			example.createCriteria().andIdIn(lista);
			return facilityMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Facility selectByPrimaryKey(String id) {
		
			return facilityMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Facility record) {
		return facilityMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Facility record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return facilityMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Facility record, FacilityExample example) {
		
		return facilityMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Facility record, FacilityExample example) {
		
		return facilityMapper.updateByExample(record, example);
	}

	@Override
	public List<Facility> selectByExample(FacilityExample example) {
		
		return facilityMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(FacilityExample example) {
		
		return facilityMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(FacilityExample example) {
		
		return facilityMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param facility
	 * @return
	 */
	public int updateVisible(Facility facility) {
		return facilityMapper.updateByPrimaryKeySelective(facility);
	}


}
