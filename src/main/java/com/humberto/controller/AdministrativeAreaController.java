package com.humberto.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdministrativeAreaController {

	public AdministrativeAreaController() {

	}

	@RequestMapping(value = "/mainAdministrativeArea", method = RequestMethod.GET)
	public ModelAndView displayMainAdministrativeArea() {
		ModelAndView mv = new ModelAndView("/administrativeArea/main");
		return mv;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public ModelAndView logout(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("/auth/login");

		// Invalidate the session if exists
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}

		return mv;
	}
}