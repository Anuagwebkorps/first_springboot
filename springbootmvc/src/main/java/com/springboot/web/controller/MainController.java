package com.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/home")
  public String home()
  {
		System.out.println("home page running...");
	  return "home";
  }
}
