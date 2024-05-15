package com.loiane.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.loiane.crudspring.model.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {


    String buscarNome = "";

    @Query(value = "" +
            "Select * from agenda" +
            "where profissional")
    String buscarNome();
    
}
