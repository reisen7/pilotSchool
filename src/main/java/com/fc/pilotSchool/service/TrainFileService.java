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
import com.fc.pilotSchool.mapper.auto.TrainFileMapper;
import com.fc.pilotSchool.model.auto.TrainFile;
import com.fc.pilotSchool.model.auto.TrainFileExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;
import com.fc.pilotSchool.util.StringUtils;

/**
 * 资料管理 TrainFileService
 * @Title: TrainFileService.java 
 * @Package com.fc.pilotSchool.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-06-02 15:16:38  
 **/
@Service
public class TrainFileService implements BaseService<TrainFile, TrainFileExample>{
	@Autowired
	private TrainFileMapper trainFileMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<TrainFile> list(Tablepar tablepar,TrainFile trainFile){
	        TrainFileExample testExample=new TrainFileExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(trainFile);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<TrainFile> list= trainFileMapper.selectByExample(testExample);
	        PageInfo<TrainFile> pageInfo = new PageInfo<TrainFile>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			TrainFileExample example=new TrainFileExample();
			example.createCriteria().andIdIn(lista);
			return trainFileMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public TrainFile selectByPrimaryKey(String id) {
		
			return trainFileMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(TrainFile record) {
		return trainFileMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(TrainFile record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return trainFileMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(TrainFile record, TrainFileExample example) {
		
		return trainFileMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(TrainFile record, TrainFileExample example) {
		
		return trainFileMapper.updateByExample(record, example);
	}

	@Override
	public List<TrainFile> selectByExample(TrainFileExample example) {
		
		return trainFileMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(TrainFileExample example) {
		
		return trainFileMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(TrainFileExample example) {
		
		return trainFileMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param trainFile
	 * @return
	 */
	public int updateVisible(TrainFile trainFile) {
		return trainFileMapper.updateByPrimaryKeySelective(trainFile);
	}


}
