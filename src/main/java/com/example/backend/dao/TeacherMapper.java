package com.example.backend.dao;

import com.example.backend.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {

    public List<Teacher> selectTeachers();

}
