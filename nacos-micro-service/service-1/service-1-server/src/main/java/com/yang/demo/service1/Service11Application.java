package com.yang.demo.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月25日
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Service11Application {
	public static void main(String[] args) {
		SpringApplication.run(Service11Application.class, args);
	}
}
