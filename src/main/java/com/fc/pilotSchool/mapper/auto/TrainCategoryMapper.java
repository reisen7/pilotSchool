package com.fc.pilotSchool.mapper.auto;

import com.fc.pilotSchool.model.auto.TrainCategory;
import com.fc.pilotSchool.model.auto.TrainCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 培训类别 TrainCategoryMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-13 20:37:10
 */
public interface TrainCategoryMapper {

    long countByExample(TrainCategoryExample example);

    int deleteByExample(TrainCategoryExample example);
	
    int deleteByPrimaryKey(String id);
	
    int insert(TrainCategory record);

    int insertSelective(TrainCategory record);

    List<TrainCategory> selectByExample(TrainCategoryExample example);
	
    TrainCategory selectByPrimaryKey(String id);
	
    int updateByExampleSelective(@Param("record") TrainCategory record, @Param("example") TrainCategoryExample example);

    int updateByExample(@Param("record") TrainCategory record, @Param("example") TrainCategoryExample example); 
	
    int updateByPrimaryKeySelective(TrainCategory record);

    int updateByPrimaryKey(TrainCategory record);
  	
}