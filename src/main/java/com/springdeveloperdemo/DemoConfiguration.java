package com.springdeveloperdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

	@Bean
	LifecycleBean lifecycleBean() {
		return new LifecycleBean();
	}
}
