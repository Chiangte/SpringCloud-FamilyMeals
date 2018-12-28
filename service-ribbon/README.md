#服务消费者(rest+ribbon)
在微服务架构中，业务都会被拆分成一个独立的服务，服务与服务的通讯是基于http restful的。
Spring cloud有两种服务调用方式，一种是ribbon+restTemplate，另一种是feign。
##ribbon简介 
Ribbon是一个客户端负载均衡器，它提供了对HTTP和TCP客户端的行为的大量控制。
Feign已经在使用Ribbon了，所以如果你在使用@FeignClient，那么这个部分也适用。
ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。Feign默认集成了ribbon。
ribbon 已经默认实现了这些配置bean：

* IClientConfig ribbonClientConfig: DefaultClientConfigImpl

* IRule ribbonRule: ZoneAvoidanceRule

* IPing ribbonPing: NoOpPing

* ServerList ribbonServerList: ConfigurationBasedServerList

* ServerListFilter ribbonServerListFilter: ZonePreferenceServerListFilter

* ILoadBalancer ribbonLoadBalancer: ZoneAwareLoadBalancer

#上手
* 1,先让eureka-client在eureka-server注册了2个实例 8762  8763 ，这就相当于一个小的集群
* 2,在此工程的配置文件指定服务的注册中心地址为http://localhost:8761/eureka/，
        程序名称为 service-ribbon，程序端口为8764。
* 3，