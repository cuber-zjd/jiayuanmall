package com.cuber.jiayuanmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * jiayuanmall会员应用程序
 *
 * @author cuber_zjd
 * @version 1.0.0
 * @date 2022/09/30
 */
@EnableFeignClients(basePackages = "com.cuber.jiayuanmall.member.feigh")
@SpringBootApplication
public class JiayuanmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiayuanmallMemberApplication.class, args);
    }

}
