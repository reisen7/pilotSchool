package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Agreement;
import com.fc.pilotSchool.model.auto.AgreementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  AgreementMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 21:03:21
 */
public interface AgreementMapper {

    long countByExample(AgreementExample example);

    int deleteByExample(AgreementExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Agreement record);

    int insertSelective(Agreement record);

    List<Agreement> selectByExample(AgreementExample example);
	
    Agreement selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Agreement record, @Param("example") AgreementExample example);

    int updateByExample(@Param("record") Agreement record, @Param("example") AgreementExample example); 
	
    int updateByPrimaryKeySelective(Agreement record);

    int updateByPrimaryKey(Agreement record);
  	
}