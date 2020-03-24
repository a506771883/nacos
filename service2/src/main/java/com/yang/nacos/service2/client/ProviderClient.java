package com.yang.nacos.service2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月24日
 */
@FeignClient(value = "service")
public interface ProviderClient {
	@GetMapping("/service")
	public String service();
}
