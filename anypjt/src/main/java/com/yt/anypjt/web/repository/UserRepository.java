package com.yt.anypjt.web.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yt.anypjt.web.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    // 필요에 따라 추가적인 쿼리 메서드를 정의
	// @Query (select * from ...)
}
