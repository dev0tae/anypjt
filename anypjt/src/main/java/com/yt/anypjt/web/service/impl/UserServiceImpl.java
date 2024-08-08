package com.yt.anypjt.web.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yt.anypjt.web.dto.UserDto;
import com.yt.anypjt.web.entity.UserEntity;
import com.yt.anypjt.web.repository.UserRepository;
import com.yt.anypjt.web.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Transactional
    @Override
    public UserEntity registerUser(UserDto userDto) {
        try {
        	
        	// 예외 처리는 공통 error 클래스 따로 만들어서 처리해할 듯.   
        	// @ControllerAdvice, @RestController
        	// @ExceptionHandler는 @Controller, @RestController가 적용된 Bean내에서 발생하는 예외를 잡아서 하나의 메세드에서 처리하는 기능

            // Dto null 체크
            if (null == userDto) {
                throw new IllegalArgumentException("UserDto cannot be null");
            }

            /*이메일 중복 검사는 front에서 실시간으로.
            if (userRepository.existsByUserEmail(userDto.getUserEmail())) {
                throw new IllegalArgumentException("Email is already in use");
            }

            // 닉네임 중복 검사
            if (userRepository.existsByNickname(userDto.getNickname())) {
                throw new IllegalArgumentException("이미 사용 중인 닉네임입니다.");
            }
            */

            UserEntity user = new UserEntity();
            
            // 성능적으로 좋지 않음
            // BeanUtils.copyProperties(userDto, user);        
            user.setNickname(userDto.getNickname());
            user.setUserEmail(userDto.getUserEmail());
            user.setUserPw(userDto.getUserPw());
            
            return userRepository.save(user);

        } catch (Exception e) {
            // 예외를 적절하게 처리하거나, 예외 메시지를 로깅
            throw new RuntimeException(e.getMessage(), e);
        }
    }

	@Override
	public boolean isNicknameTaken(String nickname) {
		
		try {
			
			if (null == nickname) {
				throw new IllegalArgumentException("nickname cannot be null");
			}
			
			UserEntity user = new UserEntity();
			user.setNickname(nickname);
			
			return userRepository.existsByNickname(user.getNickname());
			
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		
	}
	
	@Override
	public boolean isUserEmailTaken(String userEmail) {
		
		try {
			
			if (null == userEmail) {
				throw new IllegalArgumentException("userEmail cannot be null");
			}
			
			UserEntity user = new UserEntity();
			user.setUserEmail(userEmail);
			
			return userRepository.existsByUserEmail(user.getUserEmail());
			
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		
	}
}
