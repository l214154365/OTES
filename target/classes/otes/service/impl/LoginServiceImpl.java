package otes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import otes.dao.userdao;
import otes.entity.ActiveUser;
import otes.entity.user;
import otes.exception.CustomException;
import otes.service.LoginService;
import otes.util.MD5;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private userdao userDao;

	@Override
	public ActiveUser authenticat(String userid, String password) {
		user user = this.findUserByID(userid);
		if (user == null) {
			throw new CustomException("用户不存在");
		}
		String password_db = user.getPassword();
		String password_input = new MD5().getMD5ofStr(password);
		if (!password_db.equalsIgnoreCase(password_input)) {
			throw new CustomException("用户或者密码错误");
		}
		ActiveUser activeuser=new ActiveUser();
		activeuser.setUserid(userid);
		activeuser.setPassword(password);
		return activeuser;
	}
	public user findUserByID(String userid) throws Exception{
		
		
	}
}
