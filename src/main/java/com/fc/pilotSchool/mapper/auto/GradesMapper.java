package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Grades;
import com.fc.pilotSchool.model.auto.GradesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 成绩详细表 GradesMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 20:42:15
 */
public interface GradesMapper {

    long countByExample(GradesExample example);

    int deleteByExample(GradesExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Grades record);

    int insertSelective(Grades record);

    List<Grades> selectByExample(GradesExample example);
	
    Grades selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Grades record, @Param("example") GradesExample example);

    int updateByExample(@Param("record") Grades record, @Param("example") GradesExample example); 
	
    int updateByPrimaryKeySelective(Grades record);

    int updateByPrimaryKey(Grades record);
  	
}