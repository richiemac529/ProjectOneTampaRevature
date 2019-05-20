package com.controller;

import javax.servlet.http.HttpServletRequest;

import com.dao.UserDaoImpl;
import com.data.User;

public class LoginController {

	public static String Login(HttpServletRequest request) {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserDaoImpl userImpl = new UserDaoImpl();
		User user = new User();
		user = userImpl.selectUserByUsername(username);
		request.getSession().setAttribute("user", user);

		String a = "Admin", b = "1234";
		String c = "Alex", d = "0000";

		if (username.equals(a) & password.equals(b) || username.equals(c) & password.equals(d)) {

			return "/html/AdminHome.html";
		}

		else if (!(username.equals(user.getUsername()) || !password.equals(user.getPassword()))) {

			return "/html/Login.html";
		}

		else if (username.equals(user.getUsername()) & password.equals(user.getPassword())) {

			return "/html/EmployeeHome.html";

		}
		return "/html/Login.html";
	}

}
