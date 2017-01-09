package org.hshe.controller;

import org.hshe.core.domain.User;
import org.hshe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@ResponseBody
@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/query")
	public Object query(User record){
		return service.query(record);
	}
	
	@RequestMapping("/query2")
	public Object query2(){
		return service.query(null);
	}
}
