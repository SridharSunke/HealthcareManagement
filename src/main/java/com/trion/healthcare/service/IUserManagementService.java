package com.trion.healthcare.service;

import java.util.List;

import com.trion.healthcare.entity.Users;
import com.trion.healthcare.exception.UserNotFoundException;

public interface IUserManagementService {
	void saveusers(Users user);
	public List<Users> findAllUsers();
	void delete(Users user);
	void update(Users user);
	Users getUserById(Integer id) throws UserNotFoundException;

}
