package com.am.service.service_impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.am.dao.UsersMapper;
import com.am.pojo.Users;
import com.am.service.UsersService;
import org.springframework.stereotype.Component;


@Component
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public Users findUserById(int id) throws Exception {
		Users users = usersMapper.findUsersById(id);
		return users;
	}
	//public List<Integer> findIdByUser(Users user) throws Exception {
		//List<Integer> Ids = new ArrayList<Integer>();
	//public List<Integer> findIdByUser(Users user) throws Exception {
		//List<Integer> Ids = new ArrayList<Integer>();
	public Users findUser(Users user) throws Exception {
		Users users = usersMapper.findUsers(user);
		return users;
	}
	public String findMapByUserid() throws Exception{
		String result = usersMapper.findMapsByUserid(1);
		return result;
	}
}
