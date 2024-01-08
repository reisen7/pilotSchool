package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.License;
import com.fc.pilotSchool.model.auto.LicenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 执照表 LicenseMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 20:44:30
 */
public interface LicenseMapper {

    long countByExample(LicenseExample example);

    int deleteByExample(LicenseExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(License record);

    int insertSelective(License record);

    List<License> selectByExample(LicenseExample example);
	
    License selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") License record, @Param("example") LicenseExample example);

    int updateByExample(@Param("record") License record, @Param("example") LicenseExample example); 
	
    int updateByPrimaryKeySelective(License record);

    int updateByPrimaryKey(License record);
  	
}