package com.woniuxy.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniuxy.pojo.Userinfo;
import com.woniuxy.service.ITreeService;
import com.woniuxy.service.IUserinfoService;

@Controller
public class LoginController {
	@Resource
	private IUserinfoService userinfoService;
	
	@Resource
	private ITreeService treeService;
	
	@RequestMapping("/login")
	public String login(Userinfo info,HttpSession session) throws JsonProcessingException {
		System.out.println("LoginController.login()");
		info = userinfoService.login(info);
		if (info==null) {
			return "index";
		}else {
			List trees = treeService.findAll();
			ObjectMapper mapper = new ObjectMapper(); 
			String json = mapper.writeValueAsString(info.getTrees());
			session.setAttribute("info", info);
			session.setAttribute("json", json);
			System.out.println(info);
			System.out.println(json);
			return "redirect:/admin/index.jsp";
		}
	}

}
