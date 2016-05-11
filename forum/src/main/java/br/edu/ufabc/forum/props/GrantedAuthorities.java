package br.edu.ufabc.forum.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//TODO Checar como fazer esse tipo de configuração
@Component
@ConfigurationProperties("forum.roles")
public class GrantedAuthorities {

	private String student;
	private String professor;

	public String getstudent() {
		return student;
	}

	public String getProfessor() {
		return professor;
	}

}
