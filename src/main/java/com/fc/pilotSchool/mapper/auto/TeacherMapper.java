package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Teacher;
import com.fc.pilotSchool.model.auto.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 教练表 TeacherMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-08 18:33:22
 */
public interface TeacherMapper {

    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);
	
    Teacher selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example); 
	
    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
  	
}