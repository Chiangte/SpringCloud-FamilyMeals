package com.forezp.servicefeignhystrix.web;

import com.forezp.servicefeignhystrix.clients.SchedualFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HiController
 * @Description TODO
 * @Author Chiangte
 * @Date 18:22 2018/12/29
 **/
@RestController
public class HiController {

	/**
	 *  编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
	 */
	@Autowired
	SchedualFeign schedualFeign;

		@GetMapping(value = "/hi")
		public  String sayHi(@RequestParam String name){
			return  schedualFeign.sayHiFromClientOne(name);
		}
}
