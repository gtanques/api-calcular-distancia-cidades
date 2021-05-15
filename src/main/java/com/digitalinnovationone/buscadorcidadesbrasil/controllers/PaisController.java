package com.digitalinnovationone.buscadorcidadesbrasil.controllers;

import com.digitalinnovationone.buscadorcidadesbrasil.models.Pais;
import com.digitalinnovationone.buscadorcidadesbrasil.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class PaisController {

    @Autowired
    PaisService paisServices;

    @GetMapping
    public ResponseEntity<List<Pais>> buscarTodosPaises(){
        List<Pais> list = paisServices.findAll();
        return ResponseEntity.ok().body(list);
    }

}
