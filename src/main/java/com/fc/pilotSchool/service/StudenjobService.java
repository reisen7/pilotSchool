package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.StudenjobMapper;
import com.fc.pilotSchool.model.auto.Studenjob;
import com.fc.pilotSchool.model.auto.StudenjobExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 工作信息表 StudenjobService
 * @Title: StudenjobService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 10:58:07  
 **/
@Service
public class StudenjobService implements BaseService<Studenjob, StudenjobExample>{
	@Autowired
	private StudenjobMapper studenjobMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Studenjob> list(Tablepar tablepar,Studenjob studenjob){
	        StudenjobExample testExample=new StudenjobExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(studenjob);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Studenjob> list= studenjobMapper.selectByExample(testExample);
	        PageInfo<Studenjob> pageInfo = new PageInfo<Studenjob>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			StudenjobExample example=new StudenjobExample();
			example.createCriteria().andIdIn(lista);
			return studenjobMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Studenjob selectByPrimaryKey(String id) {
		
			return studenjobMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Studenjob record) {
		return studenjobMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Studenjob record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return studenjobMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Studenjob record, StudenjobExample example) {
		
		return studenjobMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Studenjob record, StudenjobExample example) {
		
		return studenjobMapper.updateByExample(record, example);
	}

	@Override
	public List<Studenjob> selectByExample(StudenjobExample example) {
		
		return studenjobMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(StudenjobExample example) {
		
		return studenjobMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(StudenjobExample example) {
		
		return studenjobMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param studenjob
	 * @return
	 */
	public int updateVisible(Studenjob studenjob) {
		return studenjobMapper.updateByPrimaryKeySelective(studenjob);
	}


}
