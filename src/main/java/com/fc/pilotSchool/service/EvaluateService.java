package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.EvaluateMapper;
import com.fc.pilotSchool.model.auto.Evaluate;
import com.fc.pilotSchool.model.auto.EvaluateExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 评价表 EvaluateService
 * @Title: EvaluateService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 20:42:39  
 **/
@Service
public class EvaluateService implements BaseService<Evaluate, EvaluateExample>{
	@Autowired
	private EvaluateMapper evaluateMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Evaluate> list(Tablepar tablepar,Evaluate evaluate){
	        EvaluateExample testExample=new EvaluateExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(evaluate);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Evaluate> list= evaluateMapper.selectByExample(testExample);
	        PageInfo<Evaluate> pageInfo = new PageInfo<Evaluate>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			EvaluateExample example=new EvaluateExample();
			example.createCriteria().andIdIn(lista);
			return evaluateMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Evaluate selectByPrimaryKey(String id) {
		
			return evaluateMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Evaluate record) {
		return evaluateMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Evaluate record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return evaluateMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Evaluate record, EvaluateExample example) {
		
		return evaluateMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Evaluate record, EvaluateExample example) {
		
		return evaluateMapper.updateByExample(record, example);
	}

	@Override
	public List<Evaluate> selectByExample(EvaluateExample example) {
		
		return evaluateMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(EvaluateExample example) {
		
		return evaluateMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(EvaluateExample example) {
		
		return evaluateMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param evaluate
	 * @return
	 */
	public int updateVisible(Evaluate evaluate) {
		return evaluateMapper.updateByPrimaryKeySelective(evaluate);
	}


}
