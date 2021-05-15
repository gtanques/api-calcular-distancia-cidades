package com.digitalinnovationone.buscadorcidadesbrasil.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="pais")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pais implements Serializable {
    @Id
    private Long id;

    @Column(name="nome")
    private String nome;
    @Column(name="sigla")
    private String sigla;
    @Column(name="bacen")
    private Integer bacen;
}
