package br.edu.ufabc.forum.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Spring Security's user role properties.
 * @author Giulio Denardi
 *
 */
@Component
@ConfigurationProperties(prefix = "forum.roles")
public class GrantedAuthorities {

	private String student;
	private String professor;

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

}
