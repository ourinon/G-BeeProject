package com.example.demo.ServiceImpl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.demo.Dao.UserDao;
import com.example.demo.Dto.TeacherDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.Service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    UserDao userDao;
	
	public UserDto matching(UserDto user,HttpSession session) {
		UserDto value = userDao.matchingUser(user);
		if(!(value.getUserEmail().equals(""))){
			session.setAttribute("user", value);
		}
		return value;
	}
	//all user
    public List<UserDto> getAllUsers() {
        return userDao.getAllUsers();
    }
 
    public UserDto getUserByUserId(String userId) {
        return userDao.getUserByUserId(userId);
    }
 
    //Insert User
    public UserDto registerUser(UserDto user) {
    	return userDao.insertUser(user);
    }
    
    //Modify User
    public void modifyUser(String userId, UserDto user) {
        userDao.updateUser(userId, user);
    }
    //ModifyPass User
    public void modifyPass(String userId, UserDto user) {
    	userDao.updatePassword(userId, user);
    }
 
    //Delete User
    public void removeUser(String userId) {
        userDao.deleteUser(userId);
    }
}
