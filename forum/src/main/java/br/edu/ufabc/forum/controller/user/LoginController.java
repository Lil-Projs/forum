package br.edu.ufabc.forum.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ufabc.forum.controller.AbstractBaseController;

/**
 * Controller for login users.
 * It's responsible for signing up and logging in new collaborators.
 */
@Controller
@RequestMapping("/login")
public class LoginController extends AbstractBaseController {

	@Override
	@RequestMapping(method=RequestMethod.GET)
	public String get(Model model) {
		return "login";
	}

}
