package br.edu.ufabc.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufabc.forum.entity.Course;

public interface CourseRepository extends JpaRepository<Course, String>{

}
