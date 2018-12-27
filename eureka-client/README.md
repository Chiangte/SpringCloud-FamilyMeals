#服务提供者 (eureka client)
  当client向server注册时，它会提供一些元数据，例如主机和端口，URL，主页等。
eureka-server 从每个client实例接收心跳消息。 
如果心跳超时，则通常将该实例从注册server中删除。
##上手
* 1,通过注解@EnableEurekaClient 表明自己是一个eurekaclient.
* 2,在配置文件 application.yml 中注明自己的服务注册中心的地址
    需要指明spring.application.name,这在以后的服务与服务之间相互调用一般都是根据这个name 
* 3, 启动此工程，打开localhost:8761，会发现服务已经注册在服务中了，服务名为SERVICE-CLIENT ,端口为7862
* 4, 再打开 localhost:8762/hi?name=forezp  页面输出： ‘ Hiforezp, I'm from port: 8762 ’