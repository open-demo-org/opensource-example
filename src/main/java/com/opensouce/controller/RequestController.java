package com.opensouce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
public class RequestController {

    /**
     * request方法
     * @return
     */
    @GetMapping("/send")
    public void request(){
        return "this is test result";
    }
}
