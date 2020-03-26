package com.yang.demo.service2.service;

import com.yang.demo.service2.ProviderService;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月26日
 */
@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {
	public String provider() {
		return "| provider";
	}
}
