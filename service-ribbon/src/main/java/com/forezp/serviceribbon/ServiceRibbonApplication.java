package com.forezp.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Chiangte
 */
@SpringBootApplication
@EnableEurekaClient      //表明自己是一个eureka-client(服务提供者)
@EnableDiscoveryClient   //向服务中心注册
public class ServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}

	/**
	 *  将RestTemplate注入IOC容器
	 * @return
	 */
	@Bean            //向程序的ioc注入一个bean: restTemplate
	@LoadBalanced   //表明这个restRemplate开启负载均衡的功能
	RestTemplate restTemplate(){
		return  new RestTemplate();
	}
}

