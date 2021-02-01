package com.example.backend.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.backend.entity.Teacher;
import com.example.backend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DemoController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping(path = "/json", method = RequestMethod.GET)
    @ResponseBody
    public String getAaa() {
        List<Teacher> list = teacherService.findAllTeachers();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", list);

        return jsonObject.toJSONString();
    }

}
