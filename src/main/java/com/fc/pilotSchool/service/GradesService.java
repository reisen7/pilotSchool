package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.GradesMapper;
import com.fc.pilotSchool.model.auto.Grades;
import com.fc.pilotSchool.model.auto.GradesExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 成绩详细表 GradesService
 * @Title: GradesService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 20:42:15  
 **/
@Service
public class GradesService implements BaseService<Grades, GradesExample>{
	@Autowired
	private GradesMapper gradesMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Grades> list(Tablepar tablepar,Grades grades){
	        GradesExample testExample=new GradesExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(grades);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Grades> list= gradesMapper.selectByExample(testExample);
	        PageInfo<Grades> pageInfo = new PageInfo<Grades>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			GradesExample example=new GradesExample();
			example.createCriteria().andIdIn(lista);
			return gradesMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Grades selectByPrimaryKey(String id) {
		
			return gradesMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Grades record) {
		return gradesMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Grades record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return gradesMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Grades record, GradesExample example) {
		
		return gradesMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Grades record, GradesExample example) {
		
		return gradesMapper.updateByExample(record, example);
	}

	@Override
	public List<Grades> selectByExample(GradesExample example) {
		
		return gradesMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(GradesExample example) {
		
		return gradesMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(GradesExample example) {
		
		return gradesMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param grades
	 * @return
	 */
	public int updateVisible(Grades grades) {
		return gradesMapper.updateByPrimaryKeySelective(grades);
	}


}
