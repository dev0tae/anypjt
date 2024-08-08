package com.yt.anypjt.web.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yt.anypjt.web.dto.UserDto;
import com.yt.anypjt.web.entity.UserEntity;
import com.yt.anypjt.web.service.UserService;

import jakarta.persistence.Temporal;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;
   
    @PostMapping("")
    	public ResponseEntity<?> registerUser(@RequestBody UserDto userDto) {
        UserEntity newUser = userService.registerUser(userDto);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
    
    @GetMapping("/check-nickname/{nickname}")
    public ResponseEntity<?> checkNickname(@PathVariable("nickname") String nickname) {
        boolean exists = userService.isNicknameTaken(nickname);
        return ResponseEntity.ok(exists);
    }
    
    @GetMapping("/check-userEmail/{userEmail}")
    public ResponseEntity<?> checkUserEmail(@PathVariable("userEmail") String userEmail) {
        boolean exists = userService.isUserEmailTaken(userEmail);
        return ResponseEntity.ok(exists);
    }
}
