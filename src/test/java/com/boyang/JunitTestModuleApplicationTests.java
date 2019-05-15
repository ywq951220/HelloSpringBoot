package com.boyang;

import com.boyang.model.Teacher;
import com.boyang.util.SpringUtil;
import org.junit.Test;

public class JunitTestModuleApplicationTests {

    @Test
    public void contextLoads() {
        Teacher teacher = (Teacher) SpringUtil.getBean("teacher");
        System.out.println(teacher.toString());
    }
}
