package br.edu.ufabc.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufabc.forum.entity.Content;

public interface ContentRepository extends JpaRepository<Content, Long> {

}
