package com.cuber.jiayuanmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.cuber.jiayuanmall.member.feigh")
@SpringBootApplication
public class JiayuanmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiayuanmallMemberApplication.class, args);
    }

}
