package com.yang.demo.api;

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
@RestController
public class UserController {

	@GetMapping(value = "/findUsernameById/{id}")
	public String findUsernameById(@PathVariable Long id){
		return "zhangsan";
	}
}

