package com.zero.vmngtm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zero.vmngtm.mapper")
public class VmngtmApplication {

	public static void main(String[] args) {
		SpringApplication.run(VmngtmApplication.class, args);
	}
}
