package com.fc.pilotSchool.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.PExperienceMapper;
import com.fc.pilotSchool.model.auto.PExperience;
import com.fc.pilotSchool.model.auto.PExperienceExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;
import com.fc.pilotSchool.util.StringUtils;

/**
 * 飞行体验活动管理人员表 PExperienceService
 * @Title: PExperienceService.java 
 * @Package com.fc.pilotSchool.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-06-03 11:55:05  
 **/
@Service
public class PExperienceService implements BaseService<PExperience, PExperienceExample>{
	@Autowired
	private PExperienceMapper pExperienceMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<PExperience> list(Tablepar tablepar,PExperience pExperience){
	        PExperienceExample testExample=new PExperienceExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(pExperience);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<PExperience> list= pExperienceMapper.selectByExample(testExample);
	        PageInfo<PExperience> pageInfo = new PageInfo<PExperience>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			PExperienceExample example=new PExperienceExample();
			example.createCriteria().andIdIn(lista);
			return pExperienceMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public PExperience selectByPrimaryKey(String id) {
		
			return pExperienceMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(PExperience record) {
		return pExperienceMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(PExperience record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return pExperienceMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(PExperience record, PExperienceExample example) {
		
		return pExperienceMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(PExperience record, PExperienceExample example) {
		
		return pExperienceMapper.updateByExample(record, example);
	}

	@Override
	public List<PExperience> selectByExample(PExperienceExample example) {
		
		return pExperienceMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(PExperienceExample example) {
		
		return pExperienceMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(PExperienceExample example) {
		
		return pExperienceMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param pExperience
	 * @return
	 */
	public int updateVisible(PExperience pExperience) {
		return pExperienceMapper.updateByPrimaryKeySelective(pExperience);
	}


}
