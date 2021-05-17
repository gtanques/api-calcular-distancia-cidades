package com.digitalinnovationone.buscadorcidadesbrasil.controllers.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErroPadrao implements Serializable {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT-3")
    private Instant timestamp;
    private Integer status;
    private String error;
    private  String mensagem;
    private String path;

    public ErroPadrao(Instant timestamp, int status, String error, String mensagem, String path) {
        super();
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.mensagem = mensagem;
        this.path = path;
    }
}
