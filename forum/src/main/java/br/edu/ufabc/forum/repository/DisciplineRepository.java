package br.edu.ufabc.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufabc.forum.entity.Discipline;

public interface DisciplineRepository extends JpaRepository<Discipline, String>{

}
