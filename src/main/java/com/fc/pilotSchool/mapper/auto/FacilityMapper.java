package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Facility;
import com.fc.pilotSchool.model.auto.FacilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 设施 FacilityMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 14:23:27
 */
public interface FacilityMapper {

    long countByExample(FacilityExample example);

    int deleteByExample(FacilityExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Facility record);

    int insertSelective(Facility record);

    List<Facility> selectByExample(FacilityExample example);
	
    Facility selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Facility record, @Param("example") FacilityExample example);

    int updateByExample(@Param("record") Facility record, @Param("example") FacilityExample example); 
	
    int updateByPrimaryKeySelective(Facility record);

    int updateByPrimaryKey(Facility record);
  	
}