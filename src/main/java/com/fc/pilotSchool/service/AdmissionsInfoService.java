package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.AdmissionsInfoMapper;
import com.fc.pilotSchool.model.auto.AdmissionsInfo;
import com.fc.pilotSchool.model.auto.AdmissionsInfoExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 招生信息 AdmissionsInfoService
 * @Title: AdmissionsInfoService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-13 22:15:47  
 **/
@Service
public class AdmissionsInfoService implements BaseService<AdmissionsInfo, AdmissionsInfoExample>{
	@Autowired
	private AdmissionsInfoMapper admissionsInfoMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<AdmissionsInfo> list(Tablepar tablepar,AdmissionsInfo admissionsInfo){
	        AdmissionsInfoExample testExample=new AdmissionsInfoExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(admissionsInfo);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<AdmissionsInfo> list= admissionsInfoMapper.selectByExample(testExample);
	        PageInfo<AdmissionsInfo> pageInfo = new PageInfo<AdmissionsInfo>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			AdmissionsInfoExample example=new AdmissionsInfoExample();
			example.createCriteria().andIdIn(lista);
			return admissionsInfoMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public AdmissionsInfo selectByPrimaryKey(String id) {
		
			return admissionsInfoMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(AdmissionsInfo record) {
		return admissionsInfoMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(AdmissionsInfo record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return admissionsInfoMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(AdmissionsInfo record, AdmissionsInfoExample example) {
		
		return admissionsInfoMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(AdmissionsInfo record, AdmissionsInfoExample example) {
		
		return admissionsInfoMapper.updateByExample(record, example);
	}

	@Override
	public List<AdmissionsInfo> selectByExample(AdmissionsInfoExample example) {
		
		return admissionsInfoMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(AdmissionsInfoExample example) {
		
		return admissionsInfoMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(AdmissionsInfoExample example) {
		
		return admissionsInfoMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param admissionsInfo
	 * @return
	 */
	public int updateVisible(AdmissionsInfo admissionsInfo) {
		return admissionsInfoMapper.updateByPrimaryKeySelective(admissionsInfo);
	}


}
