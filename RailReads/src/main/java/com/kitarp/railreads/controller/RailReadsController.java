package com.kitarp.railreads.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class RailReadsController {
	@RequestMapping(value = "/loginPage.obj")
	public String loginPage(Model model)
	{
		return "login";
	}
}
