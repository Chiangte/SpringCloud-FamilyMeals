#Feign使用断路器
Feign是自带断路器的，在D版本的Spring Cloud之后，它没有默认打开。
需要在配置文件中配置打开它
##上手
* 1，基于service-feign工程进行改造，在FeignClient的SchedualServiceHi接口的注解中加上fallback的指定类
* 2，新建SchedualServiceHiHystric类实现SchedualServiceHi 接口，并注入到Ioc容器中
* 3，启动eureka-server，servcie-feign-hystrix工程，浏览器打开http://localhost:8765/hi?name=forezp,
            此时service-hi工程没有启动，
            浏览器显示：Sorryforezp
* 3，启动eureka-client,浏览器交替显示：
            Hiforezp, I'm from port: 8762
            Hiforezp, I'm from port: 8763
* 4，证明断路器起作用；