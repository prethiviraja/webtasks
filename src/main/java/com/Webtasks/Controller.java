package com.Webtasks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	
	@GetMapping(value="/webtasks")
	public String getname() {
		return "Hello deepak thambii have a nice day ";
	}
}





