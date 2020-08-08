package com.xiaxinyu.h2;

import com.xiaxinyu.h2.mapper.UserMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class H2Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }

    @Resource
    private UserMapper userMapper;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userMapper.findById(5));
    }
}
