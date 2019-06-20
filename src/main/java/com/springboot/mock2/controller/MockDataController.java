package com.springboot.mock2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by barryfan on 6/19/19.
 */

@RestController
public class MockDataController {


    @GetMapping("/add/mock")
    public String addMock(@RequestParam(name = "uri")
                          String uri,
                          @RequestParam(name = "method")
                          String method,
                          @RequestParam(name = "text")
                          String text,
                          @RequestParam(name = "contentType")
                          String contentType) {
        return "OK";
    }
}
