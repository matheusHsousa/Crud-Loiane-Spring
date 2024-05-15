package com.loiane.crudspring.controller;

import com.loiane.crudspring.model.service.buscaService;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.loiane.crudspring.model.Course;
import com.loiane.crudspring.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseRepository courseRepository;
    private final buscaService buscaService;

    public CourseController(CourseRepository courseRepository, buscaService buscaService) {
        this.courseRepository = courseRepository;
        this.buscaService = buscaService;
    }

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }

    @PostMapping("/buscarNome")
    public ResultType downloadReportAll() {
        ResultType result = buscaService.buscarNome();
        return result;
    }
}
