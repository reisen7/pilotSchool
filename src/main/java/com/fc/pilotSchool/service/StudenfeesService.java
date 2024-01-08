package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.StudenfeesMapper;
import com.fc.pilotSchool.model.auto.Studenfees;
import com.fc.pilotSchool.model.auto.StudenfeesExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 学费 StudenfeesService
 * @Title: StudenfeesService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 21:02:59  
 **/
@Service
public class StudenfeesService implements BaseService<Studenfees, StudenfeesExample>{
	@Autowired
	private StudenfeesMapper studenfeesMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Studenfees> list(Tablepar tablepar,Studenfees studenfees){
	        StudenfeesExample testExample=new StudenfeesExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(studenfees);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Studenfees> list= studenfeesMapper.selectByExample(testExample);
	        PageInfo<Studenfees> pageInfo = new PageInfo<Studenfees>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			StudenfeesExample example=new StudenfeesExample();
			example.createCriteria().andIdIn(lista);
			return studenfeesMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Studenfees selectByPrimaryKey(String id) {
		
			return studenfeesMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Studenfees record) {
		return studenfeesMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Studenfees record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return studenfeesMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Studenfees record, StudenfeesExample example) {
		
		return studenfeesMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Studenfees record, StudenfeesExample example) {
		
		return studenfeesMapper.updateByExample(record, example);
	}

	@Override
	public List<Studenfees> selectByExample(StudenfeesExample example) {
		
		return studenfeesMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(StudenfeesExample example) {
		
		return studenfeesMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(StudenfeesExample example) {
		
		return studenfeesMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param studenfees
	 * @return
	 */
	public int updateVisible(Studenfees studenfees) {
		return studenfeesMapper.updateByPrimaryKeySelective(studenfees);
	}


}
