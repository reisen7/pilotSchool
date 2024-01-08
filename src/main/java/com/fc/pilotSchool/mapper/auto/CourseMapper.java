package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Course;
import com.fc.pilotSchool.model.auto.CourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 课程信息 CourseMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 21:48:17
 */
public interface CourseMapper {

    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);
	
    Course selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example); 
	
    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
  	
}