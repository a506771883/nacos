package com.yang.demo.service1.service;

import com.yang.demo.service1.api.ConsumerService;
import com.yang.demo.service2.ProviderService;
import org.apache.dubbo.config.annotation.Reference;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月25日
 */
@org.apache.dubbo.config.annotation.Service
public class ConsumerServiceImpl implements ConsumerService {
	@org.apache.dubbo.config.annotation.Reference
	ProviderService providerService;

	public String service() {
		return providerService.provider() + "| consumer";
	}
}
