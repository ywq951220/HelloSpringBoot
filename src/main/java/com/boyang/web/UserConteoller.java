package com.boyang.web;

import com.boyang.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserConteoller {

    @Autowired
    private User user;

    @RequestMapping("/testValue")
    @ResponseBody
    public String testValue() {
        return user.toString();
    }
}
