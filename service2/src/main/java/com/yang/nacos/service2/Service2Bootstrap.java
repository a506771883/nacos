package com.yang.nacos.service2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月23日
 */
@SpringBootApplication
@RestController
@EnableFeignClients
@EnableDiscoveryClient
public class Service2Bootstrap {
	public static void main(String[] args) {
		SpringApplication.run(Service2Bootstrap.class, args);
	}

	@Resource
	ConfigurableApplicationContext applicationContext;

	@Value("${common.name}")
	private String config1;

	@GetMapping(value = "/configs")
	public String getConfig(){
		return applicationContext.getEnvironment().getProperty("common.name");
	}
}
