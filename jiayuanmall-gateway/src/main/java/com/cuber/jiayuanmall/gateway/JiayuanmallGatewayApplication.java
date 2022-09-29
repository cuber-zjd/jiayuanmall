package com.cuber.jiayuanmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * jiayuanmall网关应用程序
 *
 * @author cuber_zjd
 * @version 1.0.0
 * @date 2022/09/27
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JiayuanmallGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(JiayuanmallGatewayApplication.class, args);
	}

}
