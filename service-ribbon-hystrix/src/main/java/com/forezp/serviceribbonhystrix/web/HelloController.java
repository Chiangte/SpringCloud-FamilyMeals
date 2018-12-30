package com.forezp.serviceribbonhystrix.web;

import com.forezp.serviceribbonhystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Chiangte
 * @Date 15:47 2018/12/29
 **/
@RestController
public class HelloController {
	@Autowired
	HelloService helloService;

	@GetMapping(value = "/hi")
	public String hi(@RequestParam  String name){
		return  helloService.hiService(name);
	}

}
