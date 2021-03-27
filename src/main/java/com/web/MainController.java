package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.User;
import com.service.UserService;

@Controller
public class MainController {

	@Autowired
	private UserService userService;

	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}

	@RequestMapping("addUser")
	@ResponseBody
	public Object addUser(User user) {
		try {
			userService.addUser(user);
			return "success";
		} catch (Exception e) {
			return "fail";
		}
	}

	@RequestMapping("updateUser")
	@ResponseBody
	public Object updateUser(User user) {
		try {
			userService.updateUser(user);
			return "success";
		} catch (Exception e) {
			return "fail";
		}
	}

	@RequestMapping("findUser")
	@ResponseBody
	public Object findUser(User user) {
		try {
			return userService.findUser(user);
		} catch (Exception e) {
			return "fail";
		}
	}
}
