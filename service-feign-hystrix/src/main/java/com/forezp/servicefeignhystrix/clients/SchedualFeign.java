package com.forezp.servicefeignhystrix.clients;

import com.forezp.servicefeignhystrix.clients.fallback.ShedualServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName SchedualFeign
 * @Description TODO
 * @Author Chiangte
 * @Date 18:17 2018/12/29
 **/
                                    //2，在FeignClient的SchedualServiceHi接口的注解中加上fallback的指定类
@FeignClient(value = "eureka-client",fallback = ShedualServiceHiHystrix.class) //1，通过@FeignClient("服务名"),来指定调用那个服务;
public interface SchedualFeign {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
