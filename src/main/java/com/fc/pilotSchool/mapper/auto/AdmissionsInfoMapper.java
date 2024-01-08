package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.AdmissionsInfo;
import com.fc.pilotSchool.model.auto.AdmissionsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 招生信息 AdmissionsInfoMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-13 22:15:47
 */
public interface AdmissionsInfoMapper {

    long countByExample(AdmissionsInfoExample example);

    int deleteByExample(AdmissionsInfoExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(AdmissionsInfo record);

    int insertSelective(AdmissionsInfo record);

    List<AdmissionsInfo> selectByExample(AdmissionsInfoExample example);
	
    AdmissionsInfo selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") AdmissionsInfo record, @Param("example") AdmissionsInfoExample example);

    int updateByExample(@Param("record") AdmissionsInfo record, @Param("example") AdmissionsInfoExample example); 
	
    int updateByPrimaryKeySelective(AdmissionsInfo record);

    int updateByPrimaryKey(AdmissionsInfo record);
  	
}