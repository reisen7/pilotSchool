package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.Evaluate;
import com.fc.pilotSchool.model.auto.EvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 评价表 EvaluateMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 20:42:39
 */
public interface EvaluateMapper {

    long countByExample(EvaluateExample example);

    int deleteByExample(EvaluateExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    List<Evaluate> selectByExample(EvaluateExample example);
	
    Evaluate selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    int updateByExample(@Param("record") Evaluate record, @Param("example") EvaluateExample example); 
	
    int updateByPrimaryKeySelective(Evaluate record);

    int updateByPrimaryKey(Evaluate record);
  	
}