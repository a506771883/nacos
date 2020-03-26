package com.yang.demo.application1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月25日
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.yang.demo")
public class Application1Bootstrap {
	public static void main(String[] args) {
		SpringApplication.run(Application1Bootstrap.class, args);
	}
}
