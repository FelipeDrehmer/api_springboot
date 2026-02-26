package dev.java10x.api.dto;

import lombok.Getter;

@Getter
public class AlunoResponse {

    private int matricula;
    private String nome;
    private String curso;
    private String semestre;

    public AlunoResponse(int matricula, String nome, String curso, String semestre) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.semestre = semestre;
    }

}
