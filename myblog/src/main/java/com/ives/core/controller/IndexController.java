package com.ives.core.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 项目主页
 * @author GPJ
 * 
 */
@Controller
public class IndexController {
	
	@RequestMapping(value="/")
	public String index(Model model) {
		
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("aaa");
		userList.add("bbb");
		userList.add("ccc");
		model.addAttribute("userList", userList);
		return "index";
	}
}
