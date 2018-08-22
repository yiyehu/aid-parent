# aid-parent

#### 项目介绍
一个使用dubbo的分布式项目，逐渐丰满中


#### 软件架构
软件架构说明
```
aid-parent
├─aid-common-parent    
│    │ 
│    ├─ framework-common  
│    │  
│    ├─ framework-front  
│    │  
│    ├─ framework-redis
│    │  
│    └─ framework-service
│ 
│ 
├─aid-facade-parent     接口
│    │ 
│    ├─aid-facade-common  公共接口
│    │    
│    │ 
│    └─aid-facade-user  用户接口
│       
│ 
├─aid-service-parent                              provider
│    │ 
│    ├─aid-service-common  公共服务实现
│    │    
│    │ 
│    └─aid-service-user  用户服务实现
│    
│    
├─aid-front-parent  前端（web/移动端）            consumer
│    │ 
│    ├─aid-front-common  公共
│    │    
│    │ 
│    └─aid-front-web  用户前端
│
```



#### 安装教程

1. zookeeper-3.5.3-beta
2. aid-parent maven项目导入


#### 使用说明

1. 目前只是一个dubbo的小的demo，所以只要打开zookeeper，
2. 运行provider：aid-service-user
3. 运行consumer：aid-front-web



