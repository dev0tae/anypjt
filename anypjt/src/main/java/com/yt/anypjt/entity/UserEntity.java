package com.yt.anypjt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * JPA에서는 객체와 DB의 테이블을 연결하는 Entity 클래스를 생성 
 */

@Builder
@NoArgsConstructor // (매개변수가 없는 생성자)
@AllArgsConstructor
@Data
@Entity
@Table(name="USER_PROFILE")
public class UserEntity {
	
	@Id  
	@Column(name = "USER_ID") // 컬럼명 따로 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name= "NICKNAME")
	private String nickName;
	
	@Column(name = "USER_EMAIL")
	private String userEmail;
	
	@Column(name = "USER_PW")
	private String userPw;
	
	

}
