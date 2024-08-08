package com.yt.anypjt.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * 
 */
@EnableJpaAuditing // 감사 기능 활성화 어노테이션. BaseEntity.java에 @EntityListeners(AuditingEntityListener.class) 어노테이션을 추가 했기에 활성화. 문제 있을 경우 따로 config 클래스에 설정해주어야 함.
@SpringBootApplication
public class AnypjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnypjtApplication.class, args);
	}

}
