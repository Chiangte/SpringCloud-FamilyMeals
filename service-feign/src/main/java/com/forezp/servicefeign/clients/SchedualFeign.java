package com.forezp.servicefeign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName SchedualFeign
 * @Description TODO 定义一个接口
 * @Author Chiangte
 * @Date 15:37 2018/12/28
 **/
@FeignClient(value = "eureka-client")  //通过@FeignClient（"服务名"），来指定调用哪个服务
public interface  SchedualFeign {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
