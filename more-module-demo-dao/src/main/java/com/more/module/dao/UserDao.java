package com.more.module.dao;

import com.more.module.maven.module.User;

/**
 * @Desc: 
 * @Auth: Carl
 * @Time: 2017年12月7日 下午9:33:30
 */
public interface UserDao {

	User queryUserById(long id);
}
