package com.yang.nacos.service1;

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
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class Service1Bootstrap {
	public static void main(String[] args) {
		SpringApplication.run(Service1Bootstrap.class, args);
	}

	@Resource
	ConfigurableApplicationContext applicationContext;

	@Value("${common.name}")
	private String config1;

	@GetMapping(value = "/configs")
	public String getConfig(){
		return applicationContext.getEnvironment().getProperty("common.name");
	}

	@GetMapping(value = "/config2")
	public String getConfig2(){
		String name = applicationContext.getEnvironment().getProperty("common.name");
		String age = applicationContext.getEnvironment().getProperty("common.age");
		String address = applicationContext.getEnvironment().getProperty("common.address");
		String birthday = applicationContext.getEnvironment().getProperty("common.birthday");
		String fullname = applicationContext.getEnvironment().getProperty("common.fullname");
		return name + "+" + age  + "+"  + address + "+"  + birthday + "+"  + fullname;
	}
}
