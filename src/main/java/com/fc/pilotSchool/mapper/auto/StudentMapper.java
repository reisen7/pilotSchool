package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Student;
import com.fc.pilotSchool.model.auto.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 学生 StudentMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-31 14:28:59
 */
public interface StudentMapper {

    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);
	
    Student selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example); 
	
    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
  	
}