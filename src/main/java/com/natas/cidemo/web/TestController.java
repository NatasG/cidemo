package com.natas.cidemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shuaigao on 04/06/2017.
 */
@RestController
@RequestMapping(value = "test")
public class TestController {

    @GetMapping(value = "")
    public String test(){
        return "hello jenkins";
    }

    @GetMapping(value = "1")
    public String test1(){
        return "hello 1";
    }

}
