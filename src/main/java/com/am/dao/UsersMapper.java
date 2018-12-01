package com.am.dao;

import java.util.ArrayList;
import java.util.List;

import com.am.pojo.Users;

import org.springframework.stereotype.Component;

@Component(value = "usersService")
public interface UsersMapper {
	// 根据id查询用户信息
	public Users findUsersById(int id) throws Exception;
//	public List<Integer> findIdsByUser(Users user) throws Exception;
	public Users findUsers(Users user) throws Exception;
	public String findMapsByUserid(int userid) throws Exception;
}
