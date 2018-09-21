package otes.control;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import otes.service.LoginService;

@Controller
public class LoginControl {
	@Autowired
	private LoginService loginService;
	
	//访问登录页面
	@RequestMapping("/Login")
	public String login(){
		return "Login";
	}
	
	//接收用户表单
	@RequestMapping("submit")
	public String login_submit(HttpSession session,String userid,String password){
		boolean result=loginService.execute(userid,password);
		if(result){
			return "******";
		}else{
			return "*******";
		}
	}
}
