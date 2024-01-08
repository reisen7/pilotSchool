package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.TrainInfo;
import com.fc.pilotSchool.model.auto.TrainInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 培训信息 TrainInfoMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-13 20:46:33
 */
public interface TrainInfoMapper {

    long countByExample(TrainInfoExample example);

    int deleteByExample(TrainInfoExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(TrainInfo record);

    int insertSelective(TrainInfo record);

    List<TrainInfo> selectByExample(TrainInfoExample example);
	
    TrainInfo selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") TrainInfo record, @Param("example") TrainInfoExample example);

    int updateByExample(@Param("record") TrainInfo record, @Param("example") TrainInfoExample example); 
	
    int updateByPrimaryKeySelective(TrainInfo record);

    int updateByPrimaryKey(TrainInfo record);
  	
}