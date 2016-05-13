package br.edu.ufabc.forum.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import br.edu.ufabc.forum.util.MessageResource;

@Controller
public abstract class BaseController {
	
	@Autowired
	protected MessageResource messageResource;

	@ModelAttribute
	public void setLocation (HttpServletRequest servletRequest) {
		messageResource.setLocale(servletRequest.getLocale());
	}
}
