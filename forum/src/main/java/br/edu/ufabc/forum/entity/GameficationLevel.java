package br.edu.ufabc.forum.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class GameficationLevel {

	@Id
	@Column(length = 255, nullable = false)
	private String name;
	@Column(nullable = false)
	private Integer level;
	@Column(nullable = false)
	private String imageUrl;

	@OneToMany
	private Set<Collaborator> collaborators;
	@OneToMany
	private Set<Professor> professors;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Set<Collaborator> getCollaborators() {
		return collaborators;
	}

	public void setCollaborators(Set<Collaborator> collaborators) {
		this.collaborators = collaborators;
	}

	public Set<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(Set<Professor> professors) {
		this.professors = professors;
	}
}
