package com.inn.cafe.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

public interface UserService {
	
	public ResponseEntity<String> signUp(Map<String, String> requestMap);
	
	public ResponseEntity<String> login(Map<String, String> requestMap);
}
