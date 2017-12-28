package com.more.module.dao.impl;

import com.more.module.dao.UserDao;
import com.more.module.maven.module.User;

/**
 * @Desc: 
 * @Auth: Carl
 * @Time: 2017年12月7日 下午9:33:57
 */
public class UserDaoImpl implements UserDao{

	@Override
	public User queryUserById(long id) {
		// TODO Auto-generated method stub
		return new User(id, "name-"+id);
	}

}
