package com.sl.pmp.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sl.pmp.entity.User;
import com.sl.pmp.service.LoginService;
@SuppressWarnings("unused")
@Controller
@RequestMapping("/user")
public class Login {
	 @Autowired 
	 public LoginService loginServiceImpl;
	 @RequestMapping("/loginPag") 
	 public String loginPag(String username,String password,HttpServletRequest request){
		
			return "pmpPag/login";
 	 
	 }
	 
	 
	 
	 @RequestMapping("/login") 
	 public String login(String username,String password,HttpServletRequest request){
		
		//HttpSession session =request.getSession();
	    //String sessionId;
		//用户登录
		 String msg = "";
			if(username != null && !username.equals("") && password != null && !password.equals("")) {
				User user = loginServiceImpl.findUserByName(username);
				if(user != null && user.getUsername().equals(username)) {
					if(password.equals(user.getPassword())) {
						 //session.setAttribute("username", username);
						 //session.setAttribute("password", password);
						// sessionId=session.getId();
						return  "pmpPag/menu";
	 				}else {
						msg = "密码不正确";
					}
				}else {
					msg = "用户不存在";
				}
			}else {
				msg = "用户名或密码不能为空";
			}
			//request.setAttribute("msg", msg);
			return "redirect:http://localhost:8080/user/loginPag";  
  
	 }
}
 
	 
	 