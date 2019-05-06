package com.humberto.controller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.humberto.entity.User;
import com.humberto.service.UserService;

@Controller
public class AuthController {
	private UserService userService;

	public AuthController() {

	}

	@Autowired
	public AuthController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView displayLogin() {
		ModelAndView mv = new ModelAndView("/auth/login");
		mv.addObject("user", new User());
		return mv;
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public ModelAndView submitLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv;

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		User user = userService.login(userName, password);

		if (user.getUserName() == null) {
			mv = new ModelAndView("redirect:/login");
		} else {
			try {
				// Get the old session and invalidate
				HttpSession oldSession = request.getSession(false);
				if (oldSession != null) {
					oldSession.invalidate();
				}

				// Generate a new session
				HttpSession newSession = request.getSession(true);

				// Setting session to expiry in 30 mins
				newSession.setMaxInactiveInterval(30 * 60);

				Cookie message = new Cookie("message", "Welcome");
				response.addCookie(message);
				// response.sendRedirect("/administrativeArea/main.jsp");
				mv = new ModelAndView("redirect:/mainAdministrativeArea");
			} catch (Exception e) {
				mv = new ModelAndView("redirect:/login");
			}
		}

		return mv;

	}

	@RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
	public ModelAndView logout(HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/auth/logout");
		return mv;
	}
}