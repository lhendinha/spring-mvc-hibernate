package com.humberto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.humberto.service.CheckPointService;

@Controller
public class CheckPointController {
	// Constructor based Dependency Injection
	private CheckPointService checkPointService;

	public CheckPointController() {

	}

	@Autowired
	public CheckPointController(CheckPointService checkPointService) {
		this.checkPointService = checkPointService;
	}

//	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
//	public ModelAndView hello(HttpServletResponse response) throws IOException {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("home");
//		return mv;
//	}
//
//	// Get All CheckPoints
//	@RequestMapping(value = "/allCheckPoints", method = RequestMethod.POST)
//	public ModelAndView displayAllUser() {
//		ModelAndView mv = new ModelAndView();
//		List<CheckPoint> checkPointList = checkPointService.getAllCheckPoints();
//		mv.addObject("checkPointList", checkPointList);
//		mv.setViewName("allCheckPoints");
//		return mv;
//	}
//
//	@RequestMapping(value = "/addCheckPoint", method = RequestMethod.GET)
//	public ModelAndView displayNewUserForm() {
//		ModelAndView mv = new ModelAndView("addCheckPoint");
//		mv.addObject("headerMessage", "Add CheckPoint Details");
//		mv.addObject("checkPoint", new CheckPoint());
//		return mv;
//	}
//
//	@RequestMapping(value = "/addCheckPoint", method = RequestMethod.POST)
//	public ModelAndView saveNewUser(@ModelAttribute CheckPoint checkPoint, BindingResult result) {
//		ModelAndView mv = new ModelAndView("redirect:/home");
//
//		if (result.hasErrors()) {
//			return new ModelAndView("error");
//		}
//		boolean isAdded = checkPointService.saveCheckPoint(checkPoint);
//		if (isAdded) {
//			mv.addObject("message", "New checkPoint successfully added");
//		} else {
//			return new ModelAndView("error");
//		}
//
//		return mv;
//	}
//
//	@RequestMapping(value = "/editCheckPoint/{id}", method = RequestMethod.GET)
//	public ModelAndView displayEditUserForm(@PathVariable Long id) {
//		ModelAndView mv = new ModelAndView("/editUser");
//		CheckPoint checkPoint = checkPointService.getCheckPointById(id);
//		mv.addObject("headerMessage", "Edit checkPoint Details");
//		mv.addObject("user", checkPoint);
//		return mv;
//	}
//
//	@RequestMapping(value = "/editCheckPoint/{id}", method = RequestMethod.POST)
//	public ModelAndView saveEditedUser(@ModelAttribute CheckPoint checkPoint, BindingResult result) {
//		ModelAndView mv = new ModelAndView("redirect:/home");
//
//		if (result.hasErrors()) {
//			System.out.println(result.toString());
//			return new ModelAndView("error");
//		}
//		boolean isSaved = checkPointService.saveCheckPoint(checkPoint);
//		if (!isSaved) {
//
//			return new ModelAndView("error");
//		}
//
//		return mv;
//	}
//
//	@RequestMapping(value = "/deleteCheckPoint/{id}", method = RequestMethod.GET)
//	public ModelAndView deleteUserById(@PathVariable Long id) {
//		boolean isDeleted = checkPointService.deleteCheckPointById(id);
//		ModelAndView mv = new ModelAndView("redirect:/home");
//		return mv;
//
//	}

}