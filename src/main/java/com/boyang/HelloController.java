package com.boyang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController  //该注解表示该类中的所有方法都添加了 @ResponseBody 注解，所以就不用再每个方法上面添加 @ResponseBody 注解了
public class HelloController {

    @Autowired
    private Student student;

    @RequestMapping("/sayHello")
//    @ResponseBody
    public String sayHello() {
        return "Hello " + student.getName() + ",您的年龄是：" + student.getAge();
    }
}
