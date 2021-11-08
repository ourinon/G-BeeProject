package com.example.demo.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	public List<UserDto> getAllUsers() {
        return userDao.getAllUsers();
    }
	
	public List<TeacherDto> getAllTeachers() {
		return userDao.getAllTeachers();
	}

	public UserDto getUserById(String userId) {
		return userDao.getUserByUserId(userId);
	}

	public UserDto insertUser(UserDto user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	public void updateUser(String userId, UserDto user) {
		
		userDao.updateUser(userId,user);
	}

	public void deleteUser(String userId) {
		userDao.deleteUser(userId);
		
	}

	public UserDto matchingUser(UserDto user) {
		// TODO Auto-generated method stub
		return userDao.matchingUser(user);
	}

	/*
	 * public String loginCheckJson(UserDto dto) { // TODO Auto-generated method
	 * stub return userDao.loginCheckJson(dto); }
	 */
	
	

}
