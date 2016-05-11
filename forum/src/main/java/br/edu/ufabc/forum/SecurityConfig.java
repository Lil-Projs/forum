package br.edu.ufabc.forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.edu.ufabc.forum.repository.CollaboratorRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private CollaboratorRepository collaboratorRepository;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.
			authorizeRequests()
				.antMatchers("/professorArea/**").hasRole("professor")
				.antMatchers("/studentArea/**").hasRole("student")
				.antMatchers("/**").permitAll()
				.anyRequest().authenticated()
				
			.and()
			
			.formLogin()
				.loginPage("/login")
				.failureUrl("/login?error=true");
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.userDetailsService(new UserDetailsService() {
				
				@Override
				public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
					return collaboratorRepository.findOne(username);
				}
			});
	}
}
