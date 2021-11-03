package com.example.demo.Android;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/android")
public class AndroidController {
	
	@PostMapping("")
	public String androidPage(HttpServletRequest request, Model model) {
		System.out.println("서버에서 안드로이드 접속 요청함~!");
		try {
			
			String androidID = request.getParameter("id");
			String androidPW = request.getParameter("pw");
			System.out.println("안드로이드에서 받아온 아이디 : " + androidID);
			System.out.println("안드로이드에서 받아온 비밀번호 : " + androidPW);
			model.addAttribute("android", androidID);
			
			return "android";
			
		}catch (Exception e) {
			System.out.println("뭔가 이상함..");
			e.printStackTrace();
			return "null";
		}
	}
	
	@GetMapping("/getAndroid")
	public String androidGet() {
		return "android";
	}

}
