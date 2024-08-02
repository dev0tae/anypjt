package com.yt.anypjt.web.entity.common;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;


@Getter
@MappedSuperclass // BaseEntity를 상속한 엔티티들은 BaseEntity에 있는 멤버변수들을 모두 컬럼으로 인식
@EntityListeners(AuditingEntityListener.class) // 자동으로 값을 매핑
/**
 * @EntityListeners(AuditingEntityListener.class) 를 추가했다. 
 * 이는 Auditing을 사용하겠다고 선언을 한 것인데, 
 * 이 한줄 추가한것만으로는 활성화를 할 수 없다. 
 * 이를 활성화하기 위해서는 Enable을 해주어야 하는데, 이를 
 * Application.java에 EnableJpaAuditing 어노테이션을 추가
 */
public abstract class BaseEntity{
	
	@CreatedDate
	@Column(name = "REGIST_DT", nullable = false)
	private LocalDateTime registDt;
	
	@LastModifiedDate
	@Column(name = "UPDATE_DT", nullable = false)
	private LocalDateTime updateDt;
}
