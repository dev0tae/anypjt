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
    
}
