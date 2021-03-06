package com.app.greenfox.controllers;

import com.app.greenfox.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class LinkablePagesController {

	StudentService service;

	public LinkablePagesController(StudentService service) {
		this.service = service;
	}


	@RequestMapping(value = "/gfa")
	public String index(Model model) {
		model.addAttribute("count", service.count());
		return "index";
	}
}
