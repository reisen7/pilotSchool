package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Studenfees;
import com.fc.pilotSchool.model.auto.StudenfeesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 学费 StudenfeesMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 21:02:59
 */
public interface StudenfeesMapper {

    long countByExample(StudenfeesExample example);

    int deleteByExample(StudenfeesExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Studenfees record);

    int insertSelective(Studenfees record);

    List<Studenfees> selectByExample(StudenfeesExample example);
	
    Studenfees selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Studenfees record, @Param("example") StudenfeesExample example);

    int updateByExample(@Param("record") Studenfees record, @Param("example") StudenfeesExample example); 
	
    int updateByPrimaryKeySelective(Studenfees record);

    int updateByPrimaryKey(Studenfees record);
  	
}