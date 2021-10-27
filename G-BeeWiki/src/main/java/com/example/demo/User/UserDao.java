package com.example.demo.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository

// Mybatis Oracle ������ @Mapper�� ����
// ������ �������Ͽ� Oracle ���� ����
// pom.xml�� oracle driver, mybatis <dependency> �� �߰�
public class UserDao {
	
	public static List<UserDto> users;
	public static List<TeacherDto> teachers;
	
	static {
		users = new ArrayList();
		
		users.add(new UserDto(1, "�̸���1", "���̵�1", "��й�ȣ1", "�г���1"));
		users.add(new UserDto(2, "�̸���2", "���̵�2", "��й�ȣ2", "�г���2"));
		users.add(new UserDto(3, "�̸���3", "���̵�3", "��й�ȣ3", "�г���3"));
		users.add(new UserDto(4, "�̸���4", "���̵�4", "��й�ȣ4", "�г���4"));
		users.add(new UserDto(5, "�̸���5", "���̵�5", "��й�ȣ5", "�г���5"));
	}
	
	static {
		teachers = new ArrayList();
		
		teachers.add(new TeacherDto(1, "�Ҽ�1"));
		teachers.add(new TeacherDto(2, "�Ҽ�2"));
		teachers.add(new TeacherDto(3, "�Ҽ�3"));
		teachers.add(new TeacherDto(4, "�Ҽ�4"));
		teachers.add(new TeacherDto(5, "�Ҽ�5"));
	}
	
	public List<UserDto> getAllusers() {
		return users;
	}
	
	public List<TeacherDto> getAllTeachers() {
		return teachers;
	}

}
