package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Examination;
import com.fc.pilotSchool.model.auto.ExaminationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 考试管理表 ExaminationMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 21:53:08
 */
public interface ExaminationMapper {

    long countByExample(ExaminationExample example);

    int deleteByExample(ExaminationExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Examination record);

    int insertSelective(Examination record);

    List<Examination> selectByExample(ExaminationExample example);
	
    Examination selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Examination record, @Param("example") ExaminationExample example);

    int updateByExample(@Param("record") Examination record, @Param("example") ExaminationExample example); 
	
    int updateByPrimaryKeySelective(Examination record);

    int updateByPrimaryKey(Examination record);
  	
}