package br.edu.ufabc.forum.entity;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@Entity
@PrimaryKeyJoinColumn(name="collaborator", referencedColumnName="username")
public class Professor extends Collaborator {

	private static final long serialVersionUID = 7628934175305284521L;

	@Column(length = 255, unique = true)
	private String helpLink;

	@ManyToMany
	private Set<Collaborator> students;
	@ManyToMany(targetEntity = Course.class)
	private Set<Course> courses;
	@OneToMany
	private Set<Discipline> disciplines;

	public String getHelpLink() {
		return helpLink;
	}

	public void setHelpLink(String helpLink) {
		this.helpLink = helpLink;
	}

	public Set<Collaborator> getStudents() {
		return students;
	}

	public void setStudents(Set<Collaborator> students) {
		this.students = students;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Set<Discipline> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(Set<Discipline> disciplines) {
		this.disciplines = disciplines;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("professor"));
	}
}
