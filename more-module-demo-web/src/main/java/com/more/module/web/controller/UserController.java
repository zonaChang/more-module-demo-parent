package com.more.module.web.controller;

import com.more.module.dao.UserDao;
import com.more.module.dao.impl.UserDaoImpl;

/**
 * @Desc: 
 * @Auth: Carl
 * @Time: 2017年12月7日 下午9:38:17
 */
public class UserController {

	private static UserDao userDao = new UserDaoImpl();
	
	public static void main(String[] args) {
		System.out.println(userDao.queryUserById(2L));
	}
}
