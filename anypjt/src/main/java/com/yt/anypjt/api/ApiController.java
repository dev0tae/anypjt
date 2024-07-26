package com.yt.anypjt.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {

	/**
	 * 
	 * @param param
	 * @return
	 */
	@GetMapping("/best")
	public String getMethodName() {
		return "파파파";
	}
	
	
}
