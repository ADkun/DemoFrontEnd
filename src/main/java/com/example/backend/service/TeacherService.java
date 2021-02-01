package com.example.backend.service;

import com.example.backend.dao.TeacherMapper;
import com.example.backend.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.temporal.Temporal;
import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    public List<Teacher> findAllTeachers() {
        return teacherMapper.selectTeachers();
    }

}
