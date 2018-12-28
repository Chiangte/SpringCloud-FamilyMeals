package com.forezp.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HelloService
 * @Description TODO 测试类 通过之前启动类注入ioc容器的restTemplate来消费eureka-client服务的“/hi”接口
 * @Author Chiangte
 * @Date 12:45 2018/12/28
 **/
@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	public String hiService(String name){
											//直接用 程序名 替代具体的url地址，
											// 在此模型中它会根据服务名来选择具体的服务实例，
											// 根据服务实例在请求的时候会用具体的url替换掉服务名
		return  restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
	}
}
