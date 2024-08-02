package com.yt.anypjt.web.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	
	private UUID userId;
	
	private String nickname;
	
	private String userEmail;
	
	private String userPw;
	
	private String userImgUrl;
	
	/*
	private Date registDt;
	
	private Date updateDt;
	
	*/
}
