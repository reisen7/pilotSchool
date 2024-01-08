package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Machine;
import com.fc.pilotSchool.model.auto.MachineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 设备表 MachineMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 14:22:57
 */
public interface MachineMapper {

    long countByExample(MachineExample example);

    int deleteByExample(MachineExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Machine record);

    int insertSelective(Machine record);

    List<Machine> selectByExample(MachineExample example);
	
    Machine selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByExample(@Param("record") Machine record, @Param("example") MachineExample example); 
	
    int updateByPrimaryKeySelective(Machine record);

    int updateByPrimaryKey(Machine record);
  	
}