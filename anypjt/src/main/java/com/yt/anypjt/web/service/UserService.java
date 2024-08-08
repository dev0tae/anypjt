package com.yt.anypjt.web.service;

import com.yt.anypjt.web.dto.UserDto;
import com.yt.anypjt.web.entity.UserEntity;

public interface UserService {
	
	/**
	 * 
	 * @param user
	 * @return
	 */
    UserEntity registerUser(UserDto userDto);
    
    /**
     * 닉네임 중복 검사 
     * @param nickname
     * @return true if nickname exists, false otherwise
     */
    boolean isNicknameTaken(String nickname);
    

    /**
     * 이메일 중복 검사
     * @param nickname
     * @return true if userEmail exists, false otherwise
     */
    boolean isUserEmailTaken(String userEmail);
    
    
    
}
