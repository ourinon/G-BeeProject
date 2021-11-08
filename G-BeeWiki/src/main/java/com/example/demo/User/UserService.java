package com.example.demo.User;

import java.util.List;

import org.springframework.ui.Model;

public interface UserService {
	
	public List<UserDto> getAllUsers(); 
	
	public UserDto getUserById(String userId);
	
	public UserDto insertUser(UserDto user);

	public List<TeacherDto> getAllTeachers();
	
	public void updateUser(String userId, UserDto user);
	
	public UserDto matchingUser(UserDto user);
}
