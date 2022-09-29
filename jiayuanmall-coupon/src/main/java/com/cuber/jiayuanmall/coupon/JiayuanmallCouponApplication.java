package com.cuber.jiayuanmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JiayuanmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiayuanmallCouponApplication.class, args);
    }

}
