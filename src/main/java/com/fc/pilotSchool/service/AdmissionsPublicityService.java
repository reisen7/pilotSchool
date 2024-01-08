package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.AdmissionsPublicityMapper;
import com.fc.pilotSchool.model.auto.AdmissionsPublicity;
import com.fc.pilotSchool.model.auto.AdmissionsPublicityExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 招生宣传 AdmissionsPublicityService
 * @Title: AdmissionsPublicityService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 10:19:40  
 **/
@Service
public class AdmissionsPublicityService implements BaseService<AdmissionsPublicity, AdmissionsPublicityExample>{
	@Autowired
	private AdmissionsPublicityMapper admissionsPublicityMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<AdmissionsPublicity> list(Tablepar tablepar,AdmissionsPublicity admissionsPublicity){
	        AdmissionsPublicityExample testExample=new AdmissionsPublicityExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(admissionsPublicity);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<AdmissionsPublicity> list= admissionsPublicityMapper.selectByExample(testExample);
	        PageInfo<AdmissionsPublicity> pageInfo = new PageInfo<AdmissionsPublicity>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			AdmissionsPublicityExample example=new AdmissionsPublicityExample();
			example.createCriteria().andIdIn(lista);
			return admissionsPublicityMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public AdmissionsPublicity selectByPrimaryKey(String id) {
		
			return admissionsPublicityMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(AdmissionsPublicity record) {
		return admissionsPublicityMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(AdmissionsPublicity record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return admissionsPublicityMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(AdmissionsPublicity record, AdmissionsPublicityExample example) {
		
		return admissionsPublicityMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(AdmissionsPublicity record, AdmissionsPublicityExample example) {
		
		return admissionsPublicityMapper.updateByExample(record, example);
	}

	@Override
	public List<AdmissionsPublicity> selectByExample(AdmissionsPublicityExample example) {
		
		return admissionsPublicityMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(AdmissionsPublicityExample example) {
		
		return admissionsPublicityMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(AdmissionsPublicityExample example) {
		
		return admissionsPublicityMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param admissionsPublicity
	 * @return
	 */
	public int updateVisible(AdmissionsPublicity admissionsPublicity) {
		return admissionsPublicityMapper.updateByPrimaryKeySelective(admissionsPublicity);
	}


}
