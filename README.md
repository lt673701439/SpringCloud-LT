# SpringCloud-LT
### 参照其他博主的博客，写的简单的demo spring cloud demo，仅供参考
#### 示例全部采用spring boot 1.5.9版本，spring cloud Edgware.RELEASE版本
#### 以后有时间再整合成框架

#### 1.服务注册与发现 eureka
#### 启动 eureka-server-one、eureka-provider、eureka-consumer

#### 2.服务注册发现与负载均衡 eureka ribbon
#### 启动 eureka-server-one、eureka-provider-ribbon1、eureka-provider-ribbon2、
#### eureka-provider-ribbon3、eureka-consumer-ribbon

#### 3.服务间接口调用
#### 启动 eureka-server-one、eureka-provider、eureka-consumer-feign

#### 4.分布式配置中心 config
#### 启动 eureka-server-one、config-server、config-client

#### 5.服务注册发现、负载均衡、熔断保护 eureka ribbon hystrix
#### 启动 eureka-server-one、eureka-provider、eureka-provider-ribbon-hystrix

#### 6.服务网关
#### 启动 eureka-server-one、eureka-provider、eureka-consumer、api-gateway

#### 7.多个服务注册中心
#### 修改了服务注册中心名称，之前的示例中都变动了,需要修改配置文件为集群模式
#### 启动 eureka-server-one、eureka-server-two、eureka-provider、eureka-consumer

#### didispace的博客地址
#### http://blog.didispace.com/Spring-Cloud%E5%9F%BA%E7%A1%80%E6%95%99%E7%A8%8B/
#### 方志朋的博客地址
#### http://blog.csdn.net/forezp/article/details/70148833