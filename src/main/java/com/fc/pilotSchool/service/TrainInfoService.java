package com.fc.pilotSchool.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fc.pilotSchool.mapper.auto.MachineMapper;
import com.fc.pilotSchool.model.auto.Machine;
import com.fc.pilotSchool.model.auto.TrainingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.TrainInfoMapper;
import com.fc.pilotSchool.model.auto.TrainInfo;
import com.fc.pilotSchool.model.auto.TrainInfoExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 培训信息 TrainInfoService
 * @Title: TrainInfoService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-13 20:46:33  
 **/
@Service
public class TrainInfoService implements BaseService<TrainInfo, TrainInfoExample>{
	@Autowired
	private TrainInfoMapper trainInfoMapper;


	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<TrainInfo> list(Tablepar tablepar,TrainInfo trainInfo){
	        TrainInfoExample testExample=new TrainInfoExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(trainInfo);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("training_id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<TrainInfo> list= trainInfoMapper.selectByExample(testExample);
	        PageInfo<TrainInfo> pageInfo = new PageInfo<TrainInfo>(list);
	        return  pageInfo;
	 }


	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			TrainInfoExample example=new TrainInfoExample();
			example.createCriteria().andTrainingIdIn(lista);
			return trainInfoMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public TrainInfo selectByPrimaryKey(String id) {
		
			return trainInfoMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(TrainInfo record) {
		return trainInfoMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(TrainInfo record) {
		
		//添加雪花主键id
		record.setTrainingId(SnowflakeIdWorker.getUUID());
			
		
		return trainInfoMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(TrainInfo record, TrainInfoExample example) {
		
		return trainInfoMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(TrainInfo record, TrainInfoExample example) {
		
		return trainInfoMapper.updateByExample(record, example);
	}

	@Override
	public List<TrainInfo> selectByExample(TrainInfoExample example) {
		
		return trainInfoMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(TrainInfoExample example) {
		
		return trainInfoMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(TrainInfoExample example) {
		
		return trainInfoMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param trainInfo
	 * @return
	 */
	public int updateVisible(TrainInfo trainInfo) {
		return trainInfoMapper.updateByPrimaryKeySelective(trainInfo);
	}


}
