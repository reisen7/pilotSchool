package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.PlaceMapper;
import com.fc.pilotSchool.model.auto.Place;
import com.fc.pilotSchool.model.auto.PlaceExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 场地 PlaceService
 * @Title: PlaceService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 14:21:55  
 **/
@Service
public class PlaceService implements BaseService<Place, PlaceExample>{
	@Autowired
	private PlaceMapper placeMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Place> list(Tablepar tablepar,Place place){
	        PlaceExample testExample=new PlaceExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(place);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Place> list= placeMapper.selectByExample(testExample);
	        PageInfo<Place> pageInfo = new PageInfo<Place>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			PlaceExample example=new PlaceExample();
			example.createCriteria().andIdIn(lista);
			return placeMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Place selectByPrimaryKey(String id) {
		
			return placeMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Place record) {
		return placeMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Place record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return placeMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Place record, PlaceExample example) {
		
		return placeMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Place record, PlaceExample example) {
		
		return placeMapper.updateByExample(record, example);
	}

	@Override
	public List<Place> selectByExample(PlaceExample example) {
		
		return placeMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(PlaceExample example) {
		
		return placeMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(PlaceExample example) {
		
		return placeMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param place
	 * @return
	 */
	public int updateVisible(Place place) {
		return placeMapper.updateByPrimaryKeySelective(place);
	}


}
