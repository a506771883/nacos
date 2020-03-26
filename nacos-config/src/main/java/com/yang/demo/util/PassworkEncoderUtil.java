package com.yang.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: YangPing
 * @Create: 2020年03月23日
 */
@Slf4j
public class PassworkEncoderUtil {
	public static void main(String[] args) {
		String encode = new BCryptPasswordEncoder().encode("nacos");
		log.info(encode);
	}
}
