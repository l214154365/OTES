package otes.entity;

import java.io.Serializable;
import java.util.List;

public class ActiveUser implements Serializable {
	private String userid;
	private String password;
	private List<premission> menu;
	private List<premission> premission;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<premission> getMenu() {
		return menu;
	}
	public void setMenu(List<premission> menu) {
		this.menu = menu;
	}
	public List<premission> getPremission() {
		return premission;
	}
	public void setPremission(List<premission> premission) {
		this.premission = premission;
	}
}
