package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = {"/elibraryy", "/elibraryy/home"})
	public String getHome() {
		return "home/index";
	}
	
	@GetMapping(value = "/elibraryy/about")
	public String getAbout() {
		return "home/about";
	}
}
