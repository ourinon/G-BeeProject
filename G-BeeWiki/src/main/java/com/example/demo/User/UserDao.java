package com.example.demo.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository

// Mybatis Oracle 연동시 @Mapper로 연동
// 스프링 설정파일에 Oracle 계정 연동
// pom.xml에 oracle driver, mybatis <dependency> 에 추가
public class UserDao {
	
	public static List<UserDto> users;
	public static List<TeacherDto> teachers;
	
	static {
		users = new ArrayList();
		
		users.add(new UserDto(1, "이메일1", "아이디1", "비밀번호1", "닉네임1"));
		users.add(new UserDto(2, "이메일2", "아이디2", "비밀번호2", "닉네임2"));
		users.add(new UserDto(3, "이메일3", "아이디3", "비밀번호3", "닉네임3"));
		users.add(new UserDto(4, "이메일4", "아이디4", "비밀번호4", "닉네임4"));
		users.add(new UserDto(5, "이메일5", "아이디5", "비밀번호5", "닉네임5"));
	}
	
	static {
		teachers = new ArrayList();
		
		teachers.add(new TeacherDto(1, "소속1"));
		teachers.add(new TeacherDto(2, "소속2"));
		teachers.add(new TeacherDto(3, "소속3"));
		teachers.add(new TeacherDto(4, "소속4"));
		teachers.add(new TeacherDto(5, "소속5"));
	}
	
	public List<UserDto> getAllusers() {
		return users;
	}
	
	public List<TeacherDto> getAllTeachers() {
		return teachers;
	}

}
