package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Studenjob;
import com.fc.pilotSchool.model.auto.StudenjobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 工作信息表 StudenjobMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 10:58:07
 */
public interface StudenjobMapper {

    long countByExample(StudenjobExample example);

    int deleteByExample(StudenjobExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Studenjob record);

    int insertSelective(Studenjob record);

    List<Studenjob> selectByExample(StudenjobExample example);
	
    Studenjob selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Studenjob record, @Param("example") StudenjobExample example);

    int updateByExample(@Param("record") Studenjob record, @Param("example") StudenjobExample example); 
	
    int updateByPrimaryKeySelective(Studenjob record);

    int updateByPrimaryKey(Studenjob record);
  	
}