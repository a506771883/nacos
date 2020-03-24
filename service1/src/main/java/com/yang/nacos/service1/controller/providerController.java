package com.yang.nacos.service1.controller;

import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月24日
 */
@RestController
@Slf4j
public class providerController {
	@GetMapping("/service")
	public String service(){
		log.info("provider");
		return "provider";
	}
}
