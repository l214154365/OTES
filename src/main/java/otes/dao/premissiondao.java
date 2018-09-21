package otes.dao;

import java.util.List;

import otes.entity.premission;

public interface premissiondao {
	//根据用户类型查询菜单
	public List<premission> findMenuListByType(String available);
	//根据用户类型查询权限
	public List<premission> findPremissionByType(String available);
}
