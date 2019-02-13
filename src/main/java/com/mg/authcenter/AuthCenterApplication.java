package com.mg.authcenter;

import com.mg.jwtcommon.security.RedisUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableDiscoveryClient
@SpringBootApplication
@Import(value = RedisUtil.class)
public class AuthCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthCenterApplication.class, args);
	}

}

