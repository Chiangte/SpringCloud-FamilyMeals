#创建服务注册中心
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