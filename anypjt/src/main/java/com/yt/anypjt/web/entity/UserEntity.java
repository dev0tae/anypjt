package com.yt.anypjt.web.entity;

import java.util.UUID;

import org.hibernate.annotations.Comment;

import com.yt.anypjt.web.entity.common.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * JPA에서는 객체와 DB의 테이블을 연결하는 Entity 클래스를 생성 
 */

@Builder
@NoArgsConstructor // (매개변수가 없는 생성자)
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true) // 부모 클래스의 필드를 포함해서 EqualsAndHashCode를 생성할지, 자식 클래스만 대상으로 생성할지 Lombok이 보기에 불분명 하기 때문에 선언해주어야 함.
@Entity
@Table(name="USER_PROFILE")
public class UserEntity extends BaseEntity{
	
	/**
	 * 기본키 생성 전략.
	 * GenerationType.IDENTITY는 INSERT 쿼리가 실행된 후에야 자동 생성된 키를 확인할 수 있기 때문에 
	 * 만약, INSERT 후에 생성된 키를 확인하려고 하면 추가적인 SELECT 쿼리를 수행해서 키 값을 찾아야 한다. 
	 * 때문에 대용량 데이터를 다룰 때에는 적합하지 않아 SEQUENCE로 처리해야 한다.
	 * UUID는 보안에 강하지만 다량의 INSERT 상황이 일어나게 되면 성능 저하의 이슈가 있다.
	 * 상황에 맞게 판단해야 함.*
	 */
		
	@Id  
	@Column(name = "USER_ID", updatable = false, nullable = false)
	@Comment("회원 ID")
	@GeneratedValue(strategy=GenerationType.UUID)
	private UUID userId;
	
	@Column(name = "NICKNAME" , nullable = false)
	@Comment("회원 닉네임")
	private String nickname;
	
	@Column(name = "USER_EMAIL" , nullable = false)
	@Comment("회원 이메일")
	private String userEmail;
	
	@Column(name = "USER_PW" , nullable = false)
	@Comment("회원 비밀번호")
	private String userPw;
	
	@Column(name = "USER_IMG_URL")
	@Comment("회원 프로필 이미지")
	private String userImgUrl;
	
}
