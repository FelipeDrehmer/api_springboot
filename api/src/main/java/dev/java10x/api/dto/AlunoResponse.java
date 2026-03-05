package dev.java10x.api.dto;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Alunos")
public class AlunoResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int matricula;
    private String nome;
    private int idCurso;
    private String semestre;

    public AlunoResponse() { }

    public AlunoResponse(int matricula, String nome, int idCurso, String semestre) {
        this.matricula = matricula;
        this.nome = nome;
        this.idCurso = idCurso;
        this.semestre = semestre;
    }
}
