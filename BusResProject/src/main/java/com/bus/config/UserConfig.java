package com.bus.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bus.model.User;


@Configuration
@ComponentScan(basePackageClasses = User.class)
public class UserConfig {
	
	
}
