package br.edu.ufabc.forum.controller.visitor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ufabc.forum.controller.BaseController;

@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

	@RequestMapping(method=RequestMethod.GET)
	public String get (Model model) {
		return "login";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String post (Model model) {
		return "login";
	}
}
