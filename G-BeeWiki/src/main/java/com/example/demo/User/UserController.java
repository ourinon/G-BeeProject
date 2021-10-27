package com.example.demo.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("") // ��� ����
	public List<UserDto> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/teacher") // ��� ������
	public List<TeacherDto> getAllTeachers() {
		return userService.getAllTeachers();
	}

}
