package br.edu.ufabc.forum;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Servlet Initializer for managing the projects' web servlets.
 * @author Giulio Denardi
 *
 */
public class ServletInitializer extends SpringBootServletInitializer { // NOPMD by giulio on 5/13/16 3:43 AM

	/**
	 * This method configures our Spring Application with our source properties.
	 * @author Giulio Denardi
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ForumApplication.class);
	}
}
