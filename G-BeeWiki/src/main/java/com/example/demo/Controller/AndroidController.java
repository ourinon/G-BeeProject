package com.example.demo.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.UserDao;
import com.example.demo.Dto.UserDto;
import com.example.demo.Service.UserService;
import com.example.demo.ServiceImpl.UserServiceImpl;
import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
@RequestMapping("/android")
public class AndroidController {
	
	@Autowired
	private UserDao userDao;
	
	
	@PostMapping("") // 안드로이드에서 스프링으로 값이 제대로 넘어왔나 확인하는 과정
	public String androidPage(HttpServletRequest request, Model model) {
		System.out.println("서버에서 안드로이드 접속 요청함~!");
		try {
			
			String androidID = request.getParameter("id");
			String androidPW = request.getParameter("pw");
			System.out.println("안드로이드에서 받아온 아이디 : " + androidID);
			System.out.println("안드로이드에서 받아온 비밀번호 : " + androidPW);
			
			return androidID;

			
		}catch (Exception e) {
			e.printStackTrace();
			return "null";
		}
	}
	
	@PostMapping("/register")
	public UserDto androidRegister(HttpServletRequest request, UserDto dto) {
		String androidID = request.getParameter("id");
		String androidPW = request.getParameter("pw");
		String androidNick = request.getParameter("nickname");
		String androidName = request.getParameter("name");
		
		System.out.println("안드로이드에서 받아온 아이디 : " + androidID);
		System.out.println("안드로이드에서 받아온 비밀번호 : " + androidPW);
		System.out.println("안드로이드에서 받아온 닉네임 : " + androidNick);
		System.out.println("안드로이드에서 받아온 이름 : " + androidName);
		
		dto = new UserDto("",androidID,"", androidPW, androidName, androidNick,"",0);
		
		userDao.insertUser(dto);
		
		// String으로 받아온 ID, PW, Nick, Name를 UserDto로 담아서 보내준다
		return null;

	}
	
	@PostMapping("/login")
	public UserDto androidLogin(HttpServletRequest request, UserDto dto) {
		String androidID = request.getParameter("id");
		String androidPW = request.getParameter("pw");
		
		System.out.println("안드로이드에서 받아온 아이디 : " + androidID);
		System.out.println("안드로이드에서 받아온 비밀번호 : " + androidPW);
		
		dto = new UserDto("", androidID,"", androidPW,"","","",0);
		
		System.out.println(userDao.matchingUser(dto));
		

		
		/* userDao.matchingUser(dto); */
		
		// String으로 받아온 ID, PW를 UserDto로 담아서 보내준다

		return dto;
	}


	

}
