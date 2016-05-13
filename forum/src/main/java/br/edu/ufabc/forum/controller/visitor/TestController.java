package br.edu.ufabc.forum.controller.visitor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestController {

	@RequestMapping("/visitor")
	public String testVisitor (Model model) {
		return "test/testVisitor";
	}
}
