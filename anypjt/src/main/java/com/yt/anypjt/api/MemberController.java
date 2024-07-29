package com.yt.anypjt.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MemberController {

	/**
	 * 
	 * @param param
	 * @return
	 */
	@GetMapping("/registerMember")
	public String registerMember() {
		return "파파파";
	}
	
	
}
