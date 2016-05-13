package br.edu.ufabc.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is Spring Boot's main application class.
 * @author Giulio Denardi
 *
 */
@SpringBootApplication
public final class ForumApplication {

	/**
	 * Main method for Spring Boot's initiation.
	 * @author Giulio Denardi
	 * @param args
	 */
	public static void main(final String... args) {
		SpringApplication.run(ForumApplication.class, args);
	}
	
	private ForumApplication () {}
}
