package com.boyang.web;

import com.boyang.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeacherConteoller {

    @Autowired
    private Teacher teacher;

    @RequestMapping("/testConfigurationProperties")
    @ResponseBody
    public String testValue() {

        return teacher.toString();
    }
}
