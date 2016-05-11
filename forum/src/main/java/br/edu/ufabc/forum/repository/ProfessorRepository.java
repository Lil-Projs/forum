package br.edu.ufabc.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufabc.forum.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
