package com.hlk.service;

import com.hlk.model.User;

public interface UserService {
	
	/**
	 * 注册用户
	 * @param user
	 */
	public void save(User user);

	/**
	 * 登陆
	 * @param user
	 * @return
	 */
	public User login(User user);
	
	/**
	 * 修改用户信息
	 * @param user
	 */
	public void update(User user);
	
	/**
	 * 根据主键id查找用户
	 * @param id
	 * @return
	 */
	public User findUserById(int id);

}
