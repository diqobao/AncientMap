package com.am.controller;



import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.am.dao.MapsMapper;
import com.am.dao.UsersMapper;
import com.am.pojo.Maps;
import com.am.pojo.Users;
import com.am.service.MapsService;
import com.am.service.UsersService;

@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/findUser.action")
    public ModelAndView find() throws Exception {
        Users usersResult = usersService.findUserById(1001);

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("user", usersResult);

        //指定视图
        modelAndView.setViewName("user");

        return modelAndView;
    }

    @RequestMapping("/userLogin.action")
    @ResponseBody
    public String userLogin(Users user, HttpSession session) throws Exception {
        Users result = usersService.findUser(user);
        if (result != null) {
            int userid = result.getId();
            String username = result.getUsername();
            session.setAttribute("username", username);
            session.setAttribute("id", userid);
            return "success";
        } else
            return "fail";
    }
}
