package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.AdmissionsPublicity;
import com.fc.pilotSchool.model.auto.AdmissionsPublicityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 招生宣传 AdmissionsPublicityMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 10:19:40
 */
public interface AdmissionsPublicityMapper {

    long countByExample(AdmissionsPublicityExample example);

    int deleteByExample(AdmissionsPublicityExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(AdmissionsPublicity record);

    int insertSelective(AdmissionsPublicity record);

    List<AdmissionsPublicity> selectByExample(AdmissionsPublicityExample example);
	
    AdmissionsPublicity selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") AdmissionsPublicity record, @Param("example") AdmissionsPublicityExample example);

    int updateByExample(@Param("record") AdmissionsPublicity record, @Param("example") AdmissionsPublicityExample example); 
	
    int updateByPrimaryKeySelective(AdmissionsPublicity record);

    int updateByPrimaryKey(AdmissionsPublicity record);
  	
}