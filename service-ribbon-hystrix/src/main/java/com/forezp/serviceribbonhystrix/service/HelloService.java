package com.forezp.serviceribbonhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author Chiangte
 * @Date 20:56 2018/12/28
 **/
@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hiError")    //创建熔断器的功能，指定fallbackMethod熔断方法；
	public  String hiService(String name){
		return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
	}

	/**
	 *  熔断方法直接返回 字符串
	 * @param name
	 * @return
	 */
	public  String hiError(String name){
		return  "HI,"+name+".Sorry,Error!";
	}
}
