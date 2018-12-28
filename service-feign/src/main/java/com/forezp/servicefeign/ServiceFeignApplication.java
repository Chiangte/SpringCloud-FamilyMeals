package com.forezp.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author Chiangte
 */
@SpringBootApplication
@EnableEurekaClient    //表明自己是一个eureka-client(服务提供者)
@EnableDiscoveryClient // 向服务中心 eureka-server 注册
@EnableFeignClients   // 开启Feign的功能：
public class ServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}

}

