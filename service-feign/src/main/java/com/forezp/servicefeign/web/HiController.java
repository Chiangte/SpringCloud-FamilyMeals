package com.forezp.servicefeign.web;

import com.forezp.servicefeign.clients.SchedualFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HiController
 * @Description TODO
 * @Author Chiangte
 * @Date 15:46 2018/12/28
 **/
@RestController
public class HiController {

	/**
	 *  编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
	 */
	@Autowired
	SchedualFeign schedualFeign;

	/**
	 * 对外暴露一个API接口，通过定义的Feign客户端SchedualFeign 来消费服务
	 * @param name
	 * @return
	 */
	@GetMapping(value = "/hi")
	public  String sayHi(@RequestParam String name){
		return  schedualFeign.sayHiFromClientOne(name);
	}
}
