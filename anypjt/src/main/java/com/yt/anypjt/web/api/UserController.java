package com.yt.anypjt.web.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yt.anypjt.web.dto.UserDto;
import com.yt.anypjt.web.entity.UserEntity;
import com.yt.anypjt.web.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;
   
    @PostMapping("")
//  public ResponseEntity<?> registerUser(@RequestBody UserDto userDto) {
    public ResponseEntity<?> registerUser() {	
    	UserDto userDto = new UserDto();
        UserEntity newUser = userService.registerUser(userDto);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
        
    }
}
