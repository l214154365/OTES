package otes.service;

import otes.entity.ActiveUser;
import otes.entity.user;

public interface LoginService {
		public ActiveUser authenticat(String userid,String password)throws Exception;
		public user findUserByID(String userid);
}
