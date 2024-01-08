package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.AgreementMapper;
import com.fc.pilotSchool.model.auto.Agreement;
import com.fc.pilotSchool.model.auto.AgreementExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 *  AgreementService
 * @Title: AgreementService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 21:03:21  
 **/
@Service
public class AgreementService implements BaseService<Agreement, AgreementExample>{
	@Autowired
	private AgreementMapper agreementMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Agreement> list(Tablepar tablepar,Agreement agreement){
	        AgreementExample testExample=new AgreementExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(agreement);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Agreement> list= agreementMapper.selectByExample(testExample);
	        PageInfo<Agreement> pageInfo = new PageInfo<Agreement>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			AgreementExample example=new AgreementExample();
			example.createCriteria().andIdIn(lista);
			return agreementMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Agreement selectByPrimaryKey(String id) {
		
			return agreementMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Agreement record) {
		return agreementMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Agreement record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return agreementMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Agreement record, AgreementExample example) {
		
		return agreementMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Agreement record, AgreementExample example) {
		
		return agreementMapper.updateByExample(record, example);
	}

	@Override
	public List<Agreement> selectByExample(AgreementExample example) {
		
		return agreementMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(AgreementExample example) {
		
		return agreementMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(AgreementExample example) {
		
		return agreementMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param agreement
	 * @return
	 */
	public int updateVisible(Agreement agreement) {
		return agreementMapper.updateByPrimaryKeySelective(agreement);
	}


}
