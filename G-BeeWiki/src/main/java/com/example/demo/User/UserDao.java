package com.example.demo.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
 
    // Select all user.
    public List<UserDto> getAllUsers() {
    	String sql = "select lpad(mm_number, 4, '0') as userNumber, mm_email as userEmail, mm_pw as userPassword, mm_nickname as userNickname, mm_name as userName from MEMBER";
    	List<UserDto> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserDto>( UserDto.class ));
        return list;
    }
    

    public UserDto getUserByUserId(String userId) {
        return getAllUsers()
                .stream()
                .filter(user -> user.getUserEmail().equals(userId))
                .findAny()
                .orElse(new UserDto());
    }
 
    // Insert User
    public UserDto insertUser(UserDto user) {
    	String sql = "insert into member(mm_number, mm_email, mm_pw, mm_nickname, mm_name) values(mm_num.nextval, ?, ?, ?, ?)";
    	jdbcTemplate.update(sql, user.getUserEmail(), user.getUserPassword(), user.getUserName(), user.getUserNickname());
        return user;
    }
    
    //Modify PassWord
    public void updateUserPW(String userId, UserDto user) {
    	String sql = "update member set mm_pw = ? where mm_email = ?";
    	jdbcTemplate.update(sql, user.getUserPassword(), userId);
    }
 
    // Modify User
    public void updateUser(String userId,UserDto user) {
    	String sql = "update member set values(100,  ?, 'email', ?, ?, ?, 'https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png', 0) where mm_email = ?";
    	jdbcTemplate.update(sql, user.getUserEmail(), user.getUserPassword(), user.getUserName(), user.getUserNickname(), userId);
    }
 
    // Delete User
    public void deleteUser(String userId) {
    	String sql = "delete from member where mm_email = ?";
    	jdbcTemplate.update(sql, userId);
    }
    
    //회원 매칭기능
    public UserDto matchingUser(UserDto user) {
    	return getAllUsers()
                .stream()
                .filter((users) -> users.getUserEmail().equals(user.getUserEmail()) &&
                				 users.getUserPassword().equals(user.getUserPassword()))
                .findAny()
                .orElse(new UserDto("","","","",""));
    }


	public List<TeacherDto> getAllTeachers() {
		// TODO Auto-generated method stub
		return null;
	}
}
