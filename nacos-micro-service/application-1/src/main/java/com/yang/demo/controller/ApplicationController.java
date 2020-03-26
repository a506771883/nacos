package com.yang.demo.controller;

import com.yang.demo.service1.api.ConsumerService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月25日
 */
@RestController
public class ApplicationController {

	@org.apache.dubbo.config.annotation.Reference
	ConsumerService consumerService;

	@GetMapping("/service")
	public String service(){
		String service = consumerService.service();
		return "test" + service;
	}
}
