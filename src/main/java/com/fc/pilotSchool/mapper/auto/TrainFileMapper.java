package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.TrainFile;
import com.fc.pilotSchool.model.auto.TrainFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 资料管理 TrainFileMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-06-02 15:16:38
 */
public interface TrainFileMapper {

    long countByExample(TrainFileExample example);

    int deleteByExample(TrainFileExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(TrainFile record);

    int insertSelective(TrainFile record);

    List<TrainFile> selectByExample(TrainFileExample example);
	
    TrainFile selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") TrainFile record, @Param("example") TrainFileExample example);

    int updateByExample(@Param("record") TrainFile record, @Param("example") TrainFileExample example); 
	
    int updateByPrimaryKeySelective(TrainFile record);

    int updateByPrimaryKey(TrainFile record);
  	
}