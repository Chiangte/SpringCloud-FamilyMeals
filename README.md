# 创建服务注册中心
spring cloud是基于springboot。spring cloud 提供了快速构建分布式系统的一些工具，
包括配置管理、服务发现、断路器、路由、微代理、事件总线、全局锁、决策竞选、分布式会话等等。
# 快速上手
* 1, 创建一个主Maven工程，在其pom文件引入依赖，这个pom文件作为父pom文件，起到依赖版本控制的作用，其他module工程继承该pom。
* 2, 一个model工程作为服务注册中心，即Eureka Server,另一个作为Eureka Client。
### 1、运行环境
* 项目构建工具：Maven
* JDK版本：jdk1.8
### 2.依赖
* spring Boot版本为2.0.3.RELEASE
* Spring Cloud版本为Finchley.RELEASE

### 3,流程
* 1,服务的注册与发现(Eureka)（eureka-server   eureka-client）(Finchley版本)

* 2,服务消费者（rest+ribbon）(service-ribbon)(Finchley版本)

* 3,服务消费者（Feign）(service-feign)(Finchley版本)

* 4,断路器（Hystrix）(service-ribbon-hystrix  service-feign-hystrix)(Finchley版本)

* 5,路由网关(zuul)(Finchley版本)

* 6,分布式配置中心(Spring Cloud Config)(Finchley版本)

* 7,高可用的分布式配置中心(Spring Cloud Config)(Finchley版本)

* 8,消息总线(Spring Cloud Bus)(Finchley版本)

* 9,服务链路追踪(Spring Cloud Sleuth)(Finchley版本)

* 10,高可用的服务注册中心(Finchley版本)

* 11,断路器监控(Hystrix Dashboard)(Finchley版本)

* 12,断路器聚合监控(Hystrix Turbine)(Finchley版本)

* 13,Spring Cloud Gateway初体验

* 14,Spring Cloud Gateway 之Predict篇

* 15,Spring Cloud Gateway 之filter篇

* 16,Spring Cloud Gateway 之限流篇

* 17,spring cloud gateway之服务注册与发现