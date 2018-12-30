package com.forezp.servicefeignhystrix.clients.fallback;

import com.forezp.servicefeignhystrix.clients.SchedualFeign;
import org.springframework.stereotype.Component;

/**
 * @ClassName ShedualServiceHiHystrix
 * @Description TODO  实现SchedualFeign 接口，并注入到Ioc容器中
 * @Author Chiangte
 * @Date 18:26 2018/12/29
 **/
@Component
public class ShedualServiceHiHystrix implements SchedualFeign {

	@Override
	public String sayHiFromClientOne(String name) {
		return "Sorry"+name;
	}
}
