package br.com.zup.edu.cineminha.application.sala;

import javax.validation.constraints.NotBlank;

public class NovaSalaRequest {

    @NotBlank
    private String nome;


    public String getNome() {
        return nome;
    }
}
