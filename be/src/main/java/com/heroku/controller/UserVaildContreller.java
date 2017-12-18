package com.heroku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


import com.heroku.mapper.UUserMapper;
import com.heroku.mapper.UUserRoleMapper;


@Controller
public class UserVaildContreller {
	
	@Value("${spring.sendgrid.api-key}")
    private String apiKey;
	
	@Autowired
	UUserMapper umaper;
	@Autowired
	UUserRoleMapper uuserRoleMapper;

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("login")
    String login() {
        return "login";
    }

    @RequestMapping("add")
    String add() {
        return "add";
    }
    @RequestMapping("addsuccess")
    String addsuccess() {
        return "addsuccess";
    }
 
    @RequestMapping("JwtSuccess")
    String JwtSuccess() {
        return "JwtSuccess";
    }
    @RequestMapping("JwtFail")
    String JwtFail() {
        return "JwtFail";
    }
    @RequestMapping("forgotpwd")
    String forgotpwd() {
        return "forgotpwd";
    }

	
	
}
