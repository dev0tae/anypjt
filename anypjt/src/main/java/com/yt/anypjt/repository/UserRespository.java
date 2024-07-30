package com.yt.anypjt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yt.anypjt.entity.UserEntity;

@Repository
public interface UserRespository extends JpaRepository<UserEntity, Integer>{
	// ?1은 메서드의 매개변수의 순서 위치다.
	//@Query("select id, userId, title, done from Todo t where t.userId = ?1")
	List<UserEntity> registerUser(String userId);
}
