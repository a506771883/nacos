package com.yang.demo.nacos;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月23日
 */
@Slf4j
public class SimpleDemoMain {
	public static void main(String[] args) throws NacosException {
		String serverAddr = "127.0.0.1:8848";
		String dataId = "nacos-simple-demo.yaml";
		String group = "DEFAULT_GROUP";
		String namespace = "c8876dff-95a3-4ac5-92fc-ccb391e6d40e";
		Properties properties = new Properties();
		properties.put("serverAddr", serverAddr);
		properties.put("namespace", namespace);
		// 获取配置
		ConfigService configService = NacosFactory.createConfigService(properties);
		String config = configService.getConfig(dataId, group, 5000);
		log.debug(config);
		configService.addListener(dataId, group, new Listener() {
			@Override
			public Executor getExecutor() {
				return null;
			}
			// 监听变化
			@Override
			public void receiveConfigInfo(String s) {
				log.info(s);
			}
		});
		while (true){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
