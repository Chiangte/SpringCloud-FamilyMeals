#服务消费者(Feign)
Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。
使用Feign，只需要创建一个接口并注解。它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。
Feign支持可插拔的编码器和解码器。Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
简而言之：
* Feign 采用的是基于接口的注解
* Feign 整合了ribbon，具有负载均衡的能力
* 整合了Hystrix，具有熔断的能力

###上手
* 1,新建一个spring-boot工程，取名为serice-feign取名为serice-feign，并在它的pom文件引入
    * Feign的起步依赖spring-cloud-starter-feign、
    * Eureka的起步依赖spring-cloud-starter-netflix-eureka-client、
    * Web的起步依赖spring-boot-starter-web，
* 2，在工程的配置文件application.yml文件，
        指定程序名为service-feign，端口号为8765，服务注册地址为http://localhost:8761/eureka/ 
* 3，在程序的启动类ServiceFeignApplication ，加上@EnableFeignClients注解开启Feign的功能：
* 4，定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。
    比如在代码中调用了service-hi服务的“/hi”接口
* 5，启动程序，多次访问http://localhost:8765/hi?name=forezp,浏览器交替显示  8762  8763 端口