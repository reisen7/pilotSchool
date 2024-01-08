package com.fc.pilotSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.MachineMapper;
import com.fc.pilotSchool.model.auto.Machine;
import com.fc.pilotSchool.model.auto.MachineExample;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 设备表 MachineService
 * @Title: MachineService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 14:22:57  
 **/
@Service
public class MachineService implements BaseService<Machine, MachineExample>{
	@Autowired
	private MachineMapper machineMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Machine> list(Tablepar tablepar,Machine machine){
	        MachineExample testExample=new MachineExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(machine);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Machine> list= machineMapper.selectByExample(testExample);
	        PageInfo<Machine> pageInfo = new PageInfo<Machine>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			MachineExample example=new MachineExample();
			example.createCriteria().andIdIn(lista);
			return machineMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Machine selectByPrimaryKey(String id) {
		
			return machineMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Machine record) {
		return machineMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Machine record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return machineMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Machine record, MachineExample example) {
		
		return machineMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Machine record, MachineExample example) {
		
		return machineMapper.updateByExample(record, example);
	}

	@Override
	public List<Machine> selectByExample(MachineExample example) {
		
		return machineMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(MachineExample example) {
		
		return machineMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(MachineExample example) {
		
		return machineMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param machine
	 * @return
	 */
	public int updateVisible(Machine machine) {
		return machineMapper.updateByPrimaryKeySelective(machine);
	}


}
