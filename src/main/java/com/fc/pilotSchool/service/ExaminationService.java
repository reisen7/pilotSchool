package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.ExaminationMapper;
import com.fc.pilotSchool.model.auto.Examination;
import com.fc.pilotSchool.model.auto.ExaminationExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 考试管理表 ExaminationService
 * @Title: ExaminationService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 21:53:08  
 **/
@Service
public class ExaminationService implements BaseService<Examination, ExaminationExample>{
	@Autowired
	private ExaminationMapper examinationMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Examination> list(Tablepar tablepar,Examination examination){
	        ExaminationExample testExample=new ExaminationExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(examination);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Examination> list= examinationMapper.selectByExample(testExample);
	        PageInfo<Examination> pageInfo = new PageInfo<Examination>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			ExaminationExample example=new ExaminationExample();
			example.createCriteria().andIdIn(lista);
			return examinationMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Examination selectByPrimaryKey(String id) {
		
			return examinationMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Examination record) {
		return examinationMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Examination record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return examinationMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Examination record, ExaminationExample example) {
		
		return examinationMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Examination record, ExaminationExample example) {
		
		return examinationMapper.updateByExample(record, example);
	}

	@Override
	public List<Examination> selectByExample(ExaminationExample example) {
		
		return examinationMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ExaminationExample example) {
		
		return examinationMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ExaminationExample example) {
		
		return examinationMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param examination
	 * @return
	 */
	public int updateVisible(Examination examination) {
		return examinationMapper.updateByPrimaryKeySelective(examination);
	}


}
