package com.cuber.jiayuanmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@MapperScan("com.cuber.jiayuanmall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class JiayuanmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(JiayuanmallProductApplication.class, args);
	}

}
