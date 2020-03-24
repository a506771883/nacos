package com.yang.nacos.service2.controller;

import com.yang.nacos.service2.client.ProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月24日
 */
@RestController
public class ConsumerController {
	@Resource
	ProviderClient providerClient;

	@GetMapping("/service")
	public String service(){
		// 远程调用
		String service = providerClient.service();
		return "consumer" + ":" + service;
	}

}
