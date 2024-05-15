package com.loiane.crudspring.model.service;

import com.loiane.crudspring.controller.ResultType;
import com.loiane.crudspring.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class buscaService {

    public ResultType buscarNome(){
        String banana = "";

        banana = CourseRepository.buscarNome;
        return null;
    }

}
