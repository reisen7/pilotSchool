package com.fc.pilotSchool.service;

import java.util.*;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fc.pilotSchool.mapper.auto.MachineMapper;
import com.fc.pilotSchool.mapper.auto.StudentMapper;
import com.fc.pilotSchool.mapper.auto.TeacherMapper;
import com.fc.pilotSchool.model.auto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.pilotSchool.common.base.BaseService;
import com.fc.pilotSchool.common.support.ConvertUtil;
import com.fc.pilotSchool.mapper.auto.TrainingInfoMapper;
import com.fc.pilotSchool.model.custom.Tablepar;
import com.fc.pilotSchool.util.SnowflakeIdWorker;

/**
 * 训练信息管理 TrainingInfoService
 * @Title: TrainingInfoService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2023-05-10 21:53:52  
 **/
@Service
public class TrainingInfoService implements BaseService<TrainingInfo, TrainingInfoExample>{
	@Autowired
	private TrainingInfoMapper trainingInfoMapper;

	@Autowired
	private MachineMapper machineMapper;

	@Autowired
	private StudentMapper studentMapper;

	@Autowired
	private TeacherMapper teacherMapper;
	
	/**
	 * 分页查询
	 * @param
	 * @param
	 * @return
	 */
	 public PageInfo<TrainingInfo> list(Tablepar tablepar,TrainingInfo trainingInfo){
	        TrainingInfoExample testExample=new TrainingInfoExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(trainingInfo);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<TrainingInfo> list= trainingInfoMapper.selectByExample(testExample);
	        PageInfo<TrainingInfo> pageInfo = new PageInfo<TrainingInfo>(list);
	        return  pageInfo;
	 }

	public List<Machine> getMachine(Date startDate, Date endDate){

		List<Machine> machineIdList = new ArrayList<>();
		// 获取全部设备id
		List<Machine> machineList = machineMapper.selectByExample(null);
		// 先获得已经有的培训的机器
		List<TrainingInfo> trainingInfos = trainingInfoMapper.selectByExample(null);
		trainingInfos.forEach(x->{
			Machine machine = new Machine();
			if (startDate.compareTo(x.getTrainStarttime()) <= 0 && endDate.compareTo(x.getTrainStarttime()) <= 0){
				machineIdList.add(machine.setId(x.getMachineId()).setMachineName(machineMapper.selectByPrimaryKey(x.getMachineId()).getMachineName()));
			}
			if (startDate.compareTo(x.getTrainEndtime()) > 0 && endDate.compareTo(x.getTrainEndtime()) > 0){
				machineIdList.add(machine.setId(x.getMachineId()).setMachineName(machineMapper.selectByPrimaryKey(x.getMachineId()).getMachineName()));
			}
			if (!machineList.contains(x.getMachineId())){
				machineIdList.add(machine.setId(x.getMachineId()).setMachineName(machineMapper.selectByPrimaryKey(x.getMachineId()).getMachineName()));
			}
		});
		return machineIdList;
	}

	public List<Student> getStudent(Date trainStarttime, Date trainEndtime) {

		List<TrainingInfo> trainingInfos = trainingInfoMapper.selectByExample(null);
		Map<String,String> map = new HashMap<>();
		trainingInfos.forEach(x-> map.put(x.getSId(),""));
		List<Student> students = studentMapper.selectByExample(null);
		List<Student> studentList = new ArrayList<>();
		students.forEach(x->{
			Student student = new Student();
			if (!map.containsKey(x.getId())){
				student.setId(x.getId());
				student.setTrueName(x.getTrueName());
				studentList.add(student);
			}
		});
		return studentList;
	}

	public List<Teacher> getTeacher(Date trainStarttime, Date trainEndtime) {

		List<TrainingInfo> trainingInfos = trainingInfoMapper.selectByExample(null);
		Map<String,String> map = new HashMap<>();
		trainingInfos.forEach(x->{
			map.put(x.getSId(),"");
		});
		QueryWrapper<Teacher> wrappers= new QueryWrapper<>();
		List<Teacher> teachers = teacherMapper.selectByExample(null);
		List<Teacher> teacherList = new ArrayList<>();
		teachers.forEach(x->{
			Teacher teacher = new Teacher();
			if (!map.containsKey(x.getId())){
				teacher.setId(x.getId());
				teacher.setTrueName(x.getTrueName());
				teacherList.add(teacher);
			}
		});
		return teacherList;
	}

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			List<String> lista=ConvertUtil.toListStrArray(ids);
			TrainingInfoExample example=new TrainingInfoExample();
			example.createCriteria().andIdIn(lista);
			return trainingInfoMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public TrainingInfo selectByPrimaryKey(String id) {
		
			return trainingInfoMapper.selectByPrimaryKey(id);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(TrainingInfo record) {
		return trainingInfoMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(TrainingInfo record) {
		
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
		
		return trainingInfoMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(TrainingInfo record, TrainingInfoExample example) {
		
		return trainingInfoMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(TrainingInfo record, TrainingInfoExample example) {
		
		return trainingInfoMapper.updateByExample(record, example);
	}

	@Override
	public List<TrainingInfo> selectByExample(TrainingInfoExample example) {
		
		return trainingInfoMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(TrainingInfoExample example) {
		
		return trainingInfoMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(TrainingInfoExample example) {
		
		return trainingInfoMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param trainingInfo
	 * @return
	 */
	public int updateVisible(TrainingInfo trainingInfo) {
		return trainingInfoMapper.updateByPrimaryKeySelective(trainingInfo);
	}


}
