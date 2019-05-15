package com.boyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * 该类的作用：
 * --用来启动项目
 * --启动自动配置
 * <p>
 * <p>
 * 在 @SpringBootApplication 中有主要的三个注解：
 * <p>
 * 1、@SpringBootConfiguration：可以把 HelloSpringBootApplication 类标志为 Spring 的一个容器，标记为容器之后就可以在该类中进
 * 行 Spring 的一些配置以及一些 Bean 的管理
 * <p>
 * 2、@EnableAutoConfiguration：启动 SpringBoot 的自动配置
 * <p>
 * 3、@ComponentScan：对整个项目中添加的所有的注解进行扫描，让该注解进行生效
 * <p>
 * <p>
 * 启动的方式
 */
@SpringBootApplication
//@PropertySource("classpath:/config/config.properties")  //指定配置文件的位置
public class HelloSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootApplication.class, args);
    }
}
