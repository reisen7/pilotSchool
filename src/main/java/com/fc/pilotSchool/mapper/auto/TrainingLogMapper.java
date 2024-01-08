package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.TrainingLog;
import com.fc.pilotSchool.model.auto.TrainingLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 训练日志管理 TrainingLogMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 19:47:59
 */
public interface TrainingLogMapper {

    long countByExample(TrainingLogExample example);

    int deleteByExample(TrainingLogExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(TrainingLog record);

    int insertSelective(TrainingLog record);

    List<TrainingLog> selectByExample(TrainingLogExample example);
	
    TrainingLog selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") TrainingLog record, @Param("example") TrainingLogExample example);

    int updateByExample(@Param("record") TrainingLog record, @Param("example") TrainingLogExample example); 
	
    int updateByPrimaryKeySelective(TrainingLog record);

    int updateByPrimaryKey(TrainingLog record);
  	
}