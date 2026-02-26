package dev.java10x.api.dto;

import lombok.Getter;

@Getter
public class CursoResponse {

    private int idCurso;
    private String nomeCurso;

    public CursoResponse(int idCurso, String nomeCurso) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
    }
}
