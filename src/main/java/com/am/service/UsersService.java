package com.am.service;

import java.util.ArrayList;
import java.util.List;

import com.am.pojo.Maps;
import com.am.pojo.Users;

public interface UsersService {
	public Users findUserById(int id) throws Exception;
	public Users findUser(Users user) throws Exception;
	//public List<Integer> findIdByUser(Users user) throws Exception;
	public String findMapByUserid() throws Exception;
}
