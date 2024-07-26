package com.yt.anypjt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	/**
	 * 스프링 부트 애플리케이션이 리액트 애플리케이션에서 오는 요청을 허용하도록 CORS를 설정
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		/*
		 * allowCredentials(true) 쿠키 인증 요청 허용
		 * allowedOrigins("*") 와 allowCredentials(true) 동시 사용 불가
		 */		
		registry.addMapping("/**")
        .allowedOrigins("http://localhost:3000")
        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
        .allowedHeaders("*")
        .allowCredentials(true);
	}
}
