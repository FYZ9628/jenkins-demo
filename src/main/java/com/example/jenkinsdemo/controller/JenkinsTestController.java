package com.example.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Administrator
 * @Date 2022/1/12 0:14
 */
@RestController
public class JenkinsTestController {

    @RequestMapping("/jenkinsTest")
    public String jenkinsTest() {

        return "jenkins test";
    }
}
