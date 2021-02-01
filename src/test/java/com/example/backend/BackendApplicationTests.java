package com.example.backend;

import com.example.backend.entity.Teacher;
import com.example.backend.service.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = BackendApplication.class)
class BackendApplicationTests {

    @Autowired
    TeacherService teacherService;

    @Test
    public void test() {
        List<Teacher> list = teacherService.findAllTeachers();
        System.out.println(list);
    }

}
