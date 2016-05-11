package br.edu.ufabc.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufabc.forum.entity.Collaborator;

public interface CollaboratorRepository extends JpaRepository<Collaborator, String> {
	
}
