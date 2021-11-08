package com.example.demo.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping("") // 모든 유저
	public List<UserDto> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/{userId}") 
	public UserDto getUserById(@PathVariable String userId) {
		return userService.getUserById(userId);
	}
	
	@PostMapping("/insertuser")
	public UserDto insertUser(@RequestBody UserDto user) {
		return userService.insertUser(user);
	}
	
	@PutMapping("/{userId}")
	public void updateUser(@PathVariable String userId, @RequestBody UserDto user) {
		userService.updateUser(userId,user);
	    getUserById(userId);
	}
	
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable String userId) {
		userService.deleteUser(userId);
	}
	
	
	@GetMapping("/teacher") // 모든 선생님getAllUsers
	public List<TeacherDto> getAllTeachers() {
		return userService.getAllTeachers();
	}
	
	@PostMapping("/login")
	public UserDto matchingUser(@RequestBody UserDto user) {
		return userService.matchingUser(user);
				
	}
	
	
	

}
