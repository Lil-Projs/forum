package br.edu.ufabc.forum.entity;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@Entity
@PrimaryKeyJoinColumn(name="collaborator", referencedColumnName="username")
public class Student extends Collaborator {

	private static final long serialVersionUID = 4169815493722760334L;

	@Column(unique=true, nullable=false)
	private Long ra;

	@ManyToMany
	private Set<Discipline> disciplines;
	@ManyToMany
	private Set<Professor> currentProfessors;

	public Long getRa() {
		return ra;
	}

	public void setRa(Long ra) {
		this.ra = ra;
	}

	public Set<Discipline> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(Set<Discipline> disciplines) {
		this.disciplines = disciplines;
	}

	public Set<Professor> getCurrentProfessors() {
		return currentProfessors;
	}

	public void setCurrentProfessors(Set<Professor> currentProfessors) {
		this.currentProfessors = currentProfessors;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("student"));
	}

}
