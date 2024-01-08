package com.fc.pilotSchool.service;

import java.util.List;

import com.fc.pilotSchool.model.auto.Student;
import com.fc.pilotSchool.model.auto.StudentExample;
import com.fc.pilotSchool.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.TeacherMapper;
import com.fc.pilotSchool.model.auto.Teacher;
import com.fc.pilotSchool.model.auto.TeacherExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 教练表 TeacherService
 * @Title: TeacherService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-08 18:33:22  
 **/
@Service
public class TeacherService implements BaseService<Teacher, TeacherExample>{
	@Autowired
	private TeacherMapper teacherMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Teacher> list(Tablepar tablepar,Teacher teacher){
	        TeacherExample testExample=new TeacherExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(teacher);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Teacher> list= teacherMapper.selectByExample(testExample);
	        PageInfo<Teacher> pageInfo = new PageInfo<Teacher>(list);
	        return  pageInfo;
	 }

	public Teacher selectByUsername(String username) {
		TeacherExample teacherExample = new TeacherExample();
		if (username != null && !username.equals("")){
			teacherExample.createCriteria().andUsernameEqualTo(username);
		}
		return teacherMapper.selectByExample(teacherExample).get(0);
	}

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			TeacherExample example=new TeacherExample();
			example.createCriteria().andIdIn(lista);
			return teacherMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Teacher selectByPrimaryKey(String id) {
		
			return teacherMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Teacher record) {
		return teacherMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Teacher record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());

		record.setPwd(MD5Util.encode(record.getPwd()));
		return teacherMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Teacher record, TeacherExample example) {
		
		return teacherMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Teacher record, TeacherExample example) {
		
		return teacherMapper.updateByExample(record, example);
	}

	@Override
	public List<Teacher> selectByExample(TeacherExample example) {
		
		return teacherMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(TeacherExample example) {
		
		return teacherMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(TeacherExample example) {
		
		return teacherMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param teacher
	 * @return
	 */
	public int updateVisible(Teacher teacher) {
		return teacherMapper.updateByPrimaryKeySelective(teacher);
	}


}
