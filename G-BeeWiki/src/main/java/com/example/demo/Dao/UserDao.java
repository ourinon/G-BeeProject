package com.example.demo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Dto.TeacherDto;
import com.example.demo.Dto.UserDto;

@Repository
public class UserDao {
	
	   @Autowired
	   private JdbcTemplate jdbcTemplate;
	 
	    // Select all user.
	    public List<UserDto> getAllUsers() {
//	       모든 정보 여과없이 가져오는 쿼리
//	       String sql = "select lpad(mm_number, 4, '0') as userNumber, mm_email as userEmail, mm_etype as userEtype, mm_pw as userPassword, mm_name as userName, mm_nickname as userNickname, mm_img as userImg, mm_admin as userAdmin from MEMBER";
	       String sql = "select lpad(mm_number, 4, '0') as userNumber, mm_email as userEmail, mm_pw as userPassword, mm_nickname as userNickname from MEMBER";
	       List<UserDto> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserDto>( UserDto.class ));
	        return list;
	    }
	 
	    // Select one user by userId
	    public UserDto getUserByUserId(String userId) {
	        return getAllUsers()
	                .stream()
	                .filter(user -> user.getUserEmail().equals(userId))
	                .findAny()
	                .orElse(new UserDto());
	    }
	 
	    // Insert User
	    public UserDto insertUser(UserDto user) {
	       String sql = "insert into member values(mm_num.nextval,  ?, 'email', ?, ?, ?, 'https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png', 0)";
	       jdbcTemplate.update(sql, user.getUserEmail(), user.getUserPassword(), user.getUserName(), user.getUserNickname());
	        return user;
	    }
	 
	 // Modify User
	    public void updateUser(String userId, UserDto user) {
	       String sql = "update member set  mm_email = ?, mm_name?, mm_nickname ? where mm_email = ?";
	       jdbcTemplate.update(sql, user.getUserEmail(), user.getUserPassword(), user.getUserName(), user.getUserNickname(), userId);
	    }
	    
	    // Modify Password
	    public void updatePassword(String userId, UserDto user) {
	       String sql = "update member set  mm_pw = ? where mm_email = ?";
	       jdbcTemplate.update(sql, user.getUserPassword(), userId);
	    }
	    
	    // Modify Img
	    public void updateImg(String userId, UserDto user) {
	       String sql = "update member set  mm_img = ? where mm_email = ?";
	       jdbcTemplate.update(sql, user.getUserImg(), userId);
	    }
	 
	    // Delete User
	    public void deleteUser(String userId) {
	       String sql = "delete from member where mm_email = ?";
	       jdbcTemplate.update(sql, userId);
	    }
	    
	    // User Comparison
	    public UserDto matchingUser(UserDto user) {
	       return getAllUsers()
	                .stream()
	                .filter((users) -> users.getUserEmail().equals(user.getUserEmail()) &&
	                             users.getUserPassword().equals(user.getUserPassword()))
	                .findAny()
	                .orElse(new UserDto());
	    }
}
