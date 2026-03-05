package dev.java10x.api.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Cursos")
public class CursoResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeCurso;

    public CursoResponse() { }

    public CursoResponse(int id, String nomeCurso) {
        this.id = id;
        this.nomeCurso = nomeCurso;
    }
}
