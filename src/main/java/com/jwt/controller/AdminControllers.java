package com.jwt.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/admin")
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public class AdminControllers {
	
	@GetMapping("/admins")
	public String AdminPart() {
		
		
		return "this is admin page";
	}

}
