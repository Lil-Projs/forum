package br.edu.ufabc.forum.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import br.edu.ufabc.forum.util.MessageResource;

/**
 * General controller created to get common information for the other controllers.
 * 
 * @author Giulio Denardi
 *
 */
@Controller
public abstract class AbstractBaseController { // NOPMD by giulio on 5/15/16 11:17 AM
	
	/**
	 * Message source for externationalization.
	 */
	@Autowired
	protected transient MessageResource messageResource;

	/**
	 * Gets the user's location.
	 * @param servletRequest
	 */
	@ModelAttribute
	public void setLocation (HttpServletRequest servletRequest) {
		messageResource.setLocale(servletRequest.getLocale());
	}
	
	/**
	 * Every controller's basic get method.
	 * @param model
	 * @return
	 */
	public abstract String get (Model model);
}
