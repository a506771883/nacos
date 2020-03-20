package com.yang.demo.api;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月20日
 */
@Controller
public class GetServiceListApi {
	@Resource
	private DiscoveryClient discoveryClient;

	@GetMapping("/getServiceList")
	public List<ServiceInstance> getServiceList() {
		List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("order-center");
		return serviceInstanceList;
	}

}
