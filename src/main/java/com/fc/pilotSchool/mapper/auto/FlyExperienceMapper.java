package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.FlyExperience;
import com.fc.pilotSchool.model.auto.FlyExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 飞行体验活动管理 FlyExperienceMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 19:49:37
 */
public interface FlyExperienceMapper {

    long countByExample(FlyExperienceExample example);

    int deleteByExample(FlyExperienceExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(FlyExperience record);

    int insertSelective(FlyExperience record);

    List<FlyExperience> selectByExample(FlyExperienceExample example);
	
    FlyExperience selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") FlyExperience record, @Param("example") FlyExperienceExample example);

    int updateByExample(@Param("record") FlyExperience record, @Param("example") FlyExperienceExample example); 
	
    int updateByPrimaryKeySelective(FlyExperience record);

    int updateByPrimaryKey(FlyExperience record);
  	
}