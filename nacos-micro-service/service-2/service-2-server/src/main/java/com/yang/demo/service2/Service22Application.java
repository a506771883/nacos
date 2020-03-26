package com.yang.demo.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月26日
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Service22Application {
	public static void main(String[] args) {
		SpringApplication.run(Service22Application.class, args);
	}
}
