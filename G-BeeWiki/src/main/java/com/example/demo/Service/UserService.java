package com.example.demo.Service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.example.demo.Dto.TeacherDto;
import com.example.demo.Dto.UserDto;

public interface UserService {
	
	public UserDto matching(UserDto user,HttpSession session);
	//all user
    public List<UserDto> getAllUsers();
 
    public UserDto getUserByUserId(String userId);
    //Insert User
    public UserDto registerUser(UserDto user);
    
    //Modify User
    public void modifyUser(String userId, UserDto user);
    //ModifyPass User
    public void modifyPass(String userId, UserDto user);
    //Delete User
    public void removeUser(String userId);
}
