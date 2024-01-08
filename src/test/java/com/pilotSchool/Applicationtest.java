package com.pilotSchool;

import com.fc.PilotApplication;
import com.fc.pilotSchool.mapper.auto.StudentMapper;
import com.fc.pilotSchool.model.auto.Student;
import com.fc.pilotSchool.model.auto.StudentExample;
import com.fc.pilotSchool.service.StudentService;
import com.fc.pilotSchool.service.TrainCategoryService;
import com.fc.pilotSchool.service.TrainInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PilotApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class Applicationtest {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private TrainCategoryService trainCategoryService;

    @Autowired
    private TrainInfoService trainInfoService;


    @Test
    public void Context(){
//        Student student = studentService.selectByUsername("Sreisen");
//        StudentExample studentExample = new StudentExample();
//        studentExample.createCriteria().andUsernameEqualTo("Sreisen");
//        System.out.println(studentMapper.selectByExample(studentExample));
        Student student = new Student();
        student.setTrainId("817358025173110784");
        System.out.println(trainCategoryService.selectByPrimaryKey(trainInfoService.selectByPrimaryKey(student.getTrainId()).getTrainCategory()).getPay());
    }
}
