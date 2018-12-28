package com.forezp.serviceribbon.controller;

import com.forezp.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO 调用HelloService 的方法
 * @Author Chiangte
 * @Date 12:55 2018/12/28
 **/
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping(value = "/hi")
    public  String hi(@RequestParam String name){
       return  helloService.hiService(name);
    }

}
