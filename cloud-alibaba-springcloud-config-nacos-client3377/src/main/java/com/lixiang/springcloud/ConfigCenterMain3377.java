package com.lixiang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/5/10
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigCenterMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3377.class,args);
    }
}
