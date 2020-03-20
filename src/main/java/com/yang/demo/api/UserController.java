package com.yang.demo.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月20日
 */
@Slf4j
@RestController
public class UserController {

	@GetMapping(value = "/findUsernameById/{id}")
	public String findUsernameById(@PathVariable Long id){
		log.debug("用户编号:"+id);
		return "zhangsan";
	}
}

