package com.digitalinnovationone.buscadorcidadesbrasil.services;

import com.digitalinnovationone.buscadorcidadesbrasil.models.Pais;
import com.digitalinnovationone.buscadorcidadesbrasil.repositories.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PaisService {
    @Autowired
    private PaisRepository paisRepository;

    @Transactional(readOnly = true)
    public Page<Pais> findAll(PageRequest page){
        Page<Pais> paginas = paisRepository.findAll(page);
        return paginas;
    }
}
