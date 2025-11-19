package com.course.projectsourcecode.services;

import org.springframework.http.ResponseEntity;

import com.course.projectsourcecode.dto.LoginRequest;
import com.course.projectsourcecode.model.MyUser;

public interface UserService {
    ResponseEntity<?> register(MyUser user);
    ResponseEntity<?> login(LoginRequest loginRequest);
}
