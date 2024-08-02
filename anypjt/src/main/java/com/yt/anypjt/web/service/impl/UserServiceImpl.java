package com.yt.anypjt.web.service.impl;

import org.springframework.stereotype.Service;

import com.yt.anypjt.web.dto.UserDto;
import com.yt.anypjt.web.entity.UserEntity;
import com.yt.anypjt.web.repository.UserRepository;
import com.yt.anypjt.web.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserEntity registerUser(UserDto userDto) {
    	
    	UserEntity user = new UserEntity();
        
        // 성능적으로 좋지 않음
        // BeanUtils.copyProperties(userDto, user);        
        user.setNickname(userDto.getNickname());
        user.setUserEmail(userDto.getUserEmail());
        user.setUserPw(userDto.getUserPw());
        
        return userRepository.save(user);
    }
}
