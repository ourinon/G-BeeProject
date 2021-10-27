package com.example.demo.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public List<UserDto> getAllUsers() {
		return userDao.getAllusers();
	}
	
	public List<TeacherDto> getAllTeachers() {
		return userDao.getAllTeachers();
	}
	
	

}
