package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.TrainingInfo;
import com.fc.pilotSchool.model.auto.TrainingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 训练信息管理 TrainingInfoMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 21:53:52
 */
public interface TrainingInfoMapper {

    long countByExample(TrainingInfoExample example);

    int deleteByExample(TrainingInfoExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(TrainingInfo record);

    int insertSelective(TrainingInfo record);

    List<TrainingInfo> selectByExample(TrainingInfoExample example);
	
    TrainingInfo selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") TrainingInfo record, @Param("example") TrainingInfoExample example);

    int updateByExample(@Param("record") TrainingInfo record, @Param("example") TrainingInfoExample example); 
	
    int updateByPrimaryKeySelective(TrainingInfo record);

    int updateByPrimaryKey(TrainingInfo record);
  	
}