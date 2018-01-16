# SpringCloud-LT
#### 参照其他博主的博客，写的非常简单的 spring cloud demo
#### 后期有时间再将这些模块整合成一个框架
### 示例全部采用spring boot 1.5.9，spring cloud Edgware.RELEASE版本

### 1.服务注册与发现 eureka
### 启动 eureka-server、eureka-provider、eureka-consumer

### 2.服务注册发现与负载均衡 eureka ribbon
### 启动 eureka-server、eureka-provider-ribbon1、eureka-provider-ribbon2、
### eureka-provider-ribbon3、eureka-consumer-ribbon

### 3.远程服务调用 feign
### 启动 eureka-server、config-server、config-client

### 4.服务注册发现、负载均衡、服务熔断 eureka ribbon hystrix
### 启动 eureka-server、eureka-provider、eureka-provider-ribbon-hystrix

### 5.服务网关
### 启动 eureka-server、eureka-provider、eureka-consumer、api-gateway

#### didispace的博客地址
#### http://blog.didispace.com/Spring-Cloud%E5%9F%BA%E7%A1%80%E6%95%99%E7%A8%8B/
#### 方志朋的博客地址
#### http://blog.csdn.net/forezp/article/details/70148833