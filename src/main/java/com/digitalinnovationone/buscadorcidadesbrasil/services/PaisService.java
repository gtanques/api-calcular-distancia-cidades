package com.digitalinnovationone.buscadorcidadesbrasil.services;

import com.digitalinnovationone.buscadorcidadesbrasil.models.Pais;
import com.digitalinnovationone.buscadorcidadesbrasil.repositories.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {
    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> findAll(){
        return paisRepository.findAll();
    }
}
