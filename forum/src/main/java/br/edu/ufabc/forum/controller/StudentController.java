package br.edu.ufabc.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/studentArea")
public class StudentController {

	@RequestMapping("/test")
	public String testStudent (Model model) {
		return "test/testStudent";
	}
}
