package com.chiru.test.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	private UserDAO userDao;

	@RequestMapping("/")
	public ModelAndView getAllusers(ModelAndView modelAndView) {
		modelAndView.setViewName("userlist");
		modelAndView.addObject("users", userDao.findAll());
		return modelAndView;
	}

	@RequestMapping("/user")
	public ModelAndView save(ModelAndView modelAndView) {
		modelAndView.setViewName("userForm");
		return modelAndView;
	}

	@RequestMapping(value = "/user/save", method = RequestMethod.POST)
	public ModelAndView save(@RequestParam(value = "userName") String userName, ModelAndView modelAndView) {
		User user = new User();
		user.setName(userName);
		userDao.save(user);
		modelAndView.addObject("userName", userName);
		modelAndView.setViewName("success");
		return modelAndView;
	}
}
