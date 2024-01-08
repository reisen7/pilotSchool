package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.CourseMapper;
import com.fc.pilotSchool.model.auto.Course;
import com.fc.pilotSchool.model.auto.CourseExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 课程信息 CourseService
 * @Title: CourseService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 21:48:17  
 **/
@Service
public class CourseService implements BaseService<Course, CourseExample>{
	@Autowired
	private CourseMapper courseMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Course> list(Tablepar tablepar,Course course){
	        CourseExample testExample=new CourseExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(course);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("c_id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Course> list= courseMapper.selectByExample(testExample);
	        PageInfo<Course> pageInfo = new PageInfo<Course>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			CourseExample example=new CourseExample();
			example.createCriteria().andCIdIn(lista);
			return courseMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Course selectByPrimaryKey(String id) {
		
			return courseMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Course record) {
		return courseMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Course record) {
		
		//添加雪花主键id
		record.setCId(SnowflakeIdWorker.getUUID());
			
		
		return courseMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Course record, CourseExample example) {
		
		return courseMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Course record, CourseExample example) {
		
		return courseMapper.updateByExample(record, example);
	}

	@Override
	public List<Course> selectByExample(CourseExample example) {
		
		return courseMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(CourseExample example) {
		
		return courseMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(CourseExample example) {
		
		return courseMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param course
	 * @return
	 */
	public int updateVisible(Course course) {
		return courseMapper.updateByPrimaryKeySelective(course);
	}


}
