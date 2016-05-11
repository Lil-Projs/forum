package br.edu.ufabc.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/professorArea")
public class ProfessorController {

	@RequestMapping("/test")
	public String testProfessor (Model model) {
		return "test/testProfessor";
	}
}
