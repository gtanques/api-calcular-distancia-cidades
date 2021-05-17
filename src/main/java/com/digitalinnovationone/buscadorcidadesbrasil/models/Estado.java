package com.digitalinnovationone.buscadorcidadesbrasil.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estado implements Serializable {
    @Id
    private Long id;
    private String nome;
    private String uf;
    private Integer ibge;
//    private Pais pais;
    private String ddd;
}
