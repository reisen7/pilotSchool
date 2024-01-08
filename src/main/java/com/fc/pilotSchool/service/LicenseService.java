package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.LicenseMapper;
import com.fc.pilotSchool.model.auto.License;
import com.fc.pilotSchool.model.auto.LicenseExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 执照表 LicenseService
 * @Title: LicenseService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 20:44:30  
 **/
@Service
public class LicenseService implements BaseService<License, LicenseExample>{
	@Autowired
	private LicenseMapper licenseMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<License> list(Tablepar tablepar,License license){
	        LicenseExample testExample=new LicenseExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(license);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<License> list= licenseMapper.selectByExample(testExample);
	        PageInfo<License> pageInfo = new PageInfo<License>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			LicenseExample example=new LicenseExample();
			example.createCriteria().andIdIn(lista);
			return licenseMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public License selectByPrimaryKey(String id) {
		
			return licenseMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(License record) {
		return licenseMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(License record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return licenseMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(License record, LicenseExample example) {
		
		return licenseMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(License record, LicenseExample example) {
		
		return licenseMapper.updateByExample(record, example);
	}

	@Override
	public List<License> selectByExample(LicenseExample example) {
		
		return licenseMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(LicenseExample example) {
		
		return licenseMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(LicenseExample example) {
		
		return licenseMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param license
	 * @return
	 */
	public int updateVisible(License license) {
		return licenseMapper.updateByPrimaryKeySelective(license);
	}


}
