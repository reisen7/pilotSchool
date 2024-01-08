package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Place;
import com.fc.pilotSchool.model.auto.PlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 场地 PlaceMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 14:21:55
 */
public interface PlaceMapper {

    long countByExample(PlaceExample example);

    int deleteByExample(PlaceExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Place record);

    int insertSelective(Place record);

    List<Place> selectByExample(PlaceExample example);
	
    Place selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Place record, @Param("example") PlaceExample example);

    int updateByExample(@Param("record") Place record, @Param("example") PlaceExample example); 
	
    int updateByPrimaryKeySelective(Place record);

    int updateByPrimaryKey(Place record);
  	
}