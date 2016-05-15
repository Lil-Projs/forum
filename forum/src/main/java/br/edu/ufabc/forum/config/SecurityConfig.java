package br.edu.ufabc.forum.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.edu.ufabc.forum.props.GrantedAuthorities;
import br.edu.ufabc.forum.repository.CollaboratorRepository;

/**
 * Spring Security configuration.
 * @author Giulio Denardi
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter { // NOPMD by giulio on 5/13/16 4:13 AM
	
	/**
	 * List of authority types used in the project.
	 */
	@Autowired
	private transient GrantedAuthorities authorities;
	
	/**
	 * This repository contains all the Spring Security's user information.
	 * It will be used to find users in the database.
	 */
	@Autowired
	private transient CollaboratorRepository collaborators;
	
	/**
	 * Configures the routes that will be blocked according to the user's role.
	 * Also sets the login page's URL and failure URL.
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception { // NOPMD by giulio on 5/13/16 4:16 AM
		http. // NOPMD by giulio on 5/13/16 4:00 AM
			authorizeRequests()
				.antMatchers("/professorArea/**").hasRole(authorities.getProfessor())
				.antMatchers("/studentArea/**").hasRole(authorities.getStudent())
				.antMatchers("/**").permitAll()
				.anyRequest().authenticated()
				
			.and()
			
			.formLogin()
				.loginPage("/login")
				.failureUrl("/login?error=true");
	}
	
	/**
	 * Configures the method to authenticate an user. In the project, via database.
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { // NOPMD by giulio on 5/13/16 4:16 AM
		auth
			.userDetailsService(new UserDetailsService() {
				
				/**
				 * Loads the user using its username (e-mail).
				 */
				@Override
				public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
					return collaborators.findOne(username);
				}
			});
	}
}
