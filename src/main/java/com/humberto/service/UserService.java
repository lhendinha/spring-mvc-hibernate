package com.humberto.service;

import java.util.List;

import com.humberto.entity.User;

public interface UserService {

	public List getAllUsers();

	public User getUserById(Long id);

	public User login(String userName, String password);

	public boolean saveUser(User user);

	public boolean deleteUserById(Long id);
}