package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Staff;
import com.fc.pilotSchool.model.auto.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 工作人员 StaffMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-08 18:48:01
 */
public interface StaffMapper {

    long countByExample(StaffExample example);

    int deleteByExample(StaffExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);
	
    Staff selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example); 
	
    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
  	
}