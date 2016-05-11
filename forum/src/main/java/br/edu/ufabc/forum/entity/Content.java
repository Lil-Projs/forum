package br.edu.ufabc.forum.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Content extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 3297905759182753921L;

	private String title;
	private String description;

	@ManyToOne(targetEntity = Collaborator.class)
	private Collaborator collaborator;
	@ManyToOne(targetEntity = Professor.class)
	private Professor professor;
	@ManyToOne(targetEntity = Discipline.class)
	private Discipline discipline;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collaborator getCollaborator() {
		return collaborator;
	}

	public void setCollaborator(Collaborator collaborator) {
		this.collaborator = collaborator;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

}
