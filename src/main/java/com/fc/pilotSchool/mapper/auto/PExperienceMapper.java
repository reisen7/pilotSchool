package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.PExperience;
import com.fc.pilotSchool.model.auto.PExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 飞行体验活动管理人员表 PExperienceMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-06-03 11:55:05
 */
public interface PExperienceMapper {

    long countByExample(PExperienceExample example);

    int deleteByExample(PExperienceExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(PExperience record);

    int insertSelective(PExperience record);

    List<PExperience> selectByExample(PExperienceExample example);
	
    PExperience selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") PExperience record, @Param("example") PExperienceExample example);

    int updateByExample(@Param("record") PExperience record, @Param("example") PExperienceExample example); 
	
    int updateByPrimaryKeySelective(PExperience record);

    int updateByPrimaryKey(PExperience record);
  	
}