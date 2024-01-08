package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.TrainCategoryMapper;
import com.fc.pilotSchool.model.auto.TrainCategory;
import com.fc.pilotSchool.model.auto.TrainCategoryExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 培训类别 TrainCategoryService
 * @Title: TrainCategoryService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-13 20:37:10  
 **/
@Service
public class TrainCategoryService implements BaseService<TrainCategory, TrainCategoryExample>{
	@Autowired
	private TrainCategoryMapper trainCategoryMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<TrainCategory> list(Tablepar tablepar,TrainCategory trainCategory){
	        TrainCategoryExample testExample=new TrainCategoryExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(trainCategory);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<TrainCategory> list= trainCategoryMapper.selectByExample(testExample);
	        PageInfo<TrainCategory> pageInfo = new PageInfo<TrainCategory>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			TrainCategoryExample example=new TrainCategoryExample();
			example.createCriteria().andIdIn(lista);
			return trainCategoryMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public TrainCategory selectByPrimaryKey(String id) {
		
			return trainCategoryMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(TrainCategory record) {
		return trainCategoryMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(TrainCategory record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return trainCategoryMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(TrainCategory record, TrainCategoryExample example) {
		
		return trainCategoryMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(TrainCategory record, TrainCategoryExample example) {
		
		return trainCategoryMapper.updateByExample(record, example);
	}

	@Override
	public List<TrainCategory> selectByExample(TrainCategoryExample example) {
		
		return trainCategoryMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(TrainCategoryExample example) {
		
		return trainCategoryMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(TrainCategoryExample example) {
		
		return trainCategoryMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param trainCategory
	 * @return
	 */
	public int updateVisible(TrainCategory trainCategory) {
		return trainCategoryMapper.updateByPrimaryKeySelective(trainCategory);
	}


}
