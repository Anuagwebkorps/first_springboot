package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class TestController {
	@RequestMapping("/god")
	@ResponseBody
  public String handleTest()
  {
	return "just testing...";
	  
  }
}
// ye dalo chrom per http://localhost:8282/god
