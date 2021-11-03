package com.example.demo.Test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class TestController {
	
	@GetMapping("/index")
	public String ServerTest(Model model) {
		model.addAttribute("name", "hello spring");
		return "index";
	}
	
}
