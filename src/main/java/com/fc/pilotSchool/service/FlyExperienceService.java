package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.FlyExperienceMapper;
import com.fc.pilotSchool.model.auto.FlyExperience;
import com.fc.pilotSchool.model.auto.FlyExperienceExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 飞行体验活动管理 FlyExperienceService
 * @Title: FlyExperienceService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 19:49:37  
 **/
@Service
public class FlyExperienceService implements BaseService<FlyExperience, FlyExperienceExample>{
	@Autowired
	private FlyExperienceMapper flyExperienceMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<FlyExperience> list(Tablepar tablepar,FlyExperience flyExperience){
	        FlyExperienceExample testExample=new FlyExperienceExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(flyExperience);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<FlyExperience> list= flyExperienceMapper.selectByExample(testExample);
	        PageInfo<FlyExperience> pageInfo = new PageInfo<FlyExperience>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			FlyExperienceExample example=new FlyExperienceExample();
			example.createCriteria().andIdIn(lista);
			return flyExperienceMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public FlyExperience selectByPrimaryKey(String id) {
		
			return flyExperienceMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(FlyExperience record) {
		return flyExperienceMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(FlyExperience record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return flyExperienceMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(FlyExperience record, FlyExperienceExample example) {
		
		return flyExperienceMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(FlyExperience record, FlyExperienceExample example) {
		
		return flyExperienceMapper.updateByExample(record, example);
	}

	@Override
	public List<FlyExperience> selectByExample(FlyExperienceExample example) {
		
		return flyExperienceMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(FlyExperienceExample example) {
		
		return flyExperienceMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(FlyExperienceExample example) {
		
		return flyExperienceMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param flyExperience
	 * @return
	 */
	public int updateVisible(FlyExperience flyExperience) {
		return flyExperienceMapper.updateByPrimaryKeySelective(flyExperience);
	}


}
