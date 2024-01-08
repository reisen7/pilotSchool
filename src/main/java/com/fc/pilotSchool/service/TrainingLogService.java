package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.TrainingLogMapper;
import com.fc.pilotSchool.model.auto.TrainingLog;
import com.fc.pilotSchool.model.auto.TrainingLogExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 训练日志管理 TrainingLogService
 * @Title: TrainingLogService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 19:47:59  
 **/
@Service
public class TrainingLogService implements BaseService<TrainingLog, TrainingLogExample>{
	@Autowired
	private TrainingLogMapper trainingLogMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<TrainingLog> list(Tablepar tablepar,TrainingLog trainingLog){
	        TrainingLogExample testExample=new TrainingLogExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(trainingLog);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<TrainingLog> list= trainingLogMapper.selectByExample(testExample);
	        PageInfo<TrainingLog> pageInfo = new PageInfo<TrainingLog>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			TrainingLogExample example=new TrainingLogExample();
			example.createCriteria().andIdIn(lista);
			return trainingLogMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public TrainingLog selectByPrimaryKey(String id) {
		
			return trainingLogMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(TrainingLog record) {
		return trainingLogMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(TrainingLog record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return trainingLogMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(TrainingLog record, TrainingLogExample example) {
		
		return trainingLogMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(TrainingLog record, TrainingLogExample example) {
		
		return trainingLogMapper.updateByExample(record, example);
	}

	@Override
	public List<TrainingLog> selectByExample(TrainingLogExample example) {
		
		return trainingLogMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(TrainingLogExample example) {
		
		return trainingLogMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(TrainingLogExample example) {
		
		return trainingLogMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param trainingLog
	 * @return
	 */
	public int updateVisible(TrainingLog trainingLog) {
		return trainingLogMapper.updateByPrimaryKeySelective(trainingLog);
	}


}
