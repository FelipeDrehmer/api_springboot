package dev.java10x.api.service;

import dev.java10x.api.dto.InfoResponse;
import dev.java10x.api.dto.CursoResponse;
import dev.java10x.api.dto.AlunoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tools.jackson.databind.node.ValueNode;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ApiService {

    @Value("${spring.application.name}")
    private String nomeProjeto;

    @Value("${spring.application.version}")
    private String versaoProjeto;

    private final List<CursoResponse> cursos = List.of(
            new CursoResponse(1, "Engenharia de Software"),
            new CursoResponse(2, "Engenharia da Computação"),
            new CursoResponse(3, "Engenharia Civil"),
            new CursoResponse(4, "Engenharia Mecanica"),
            new CursoResponse(5, "Engenharia de Dados")
    );

    private final List<AlunoResponse> alunos = List.of(
            new AlunoResponse(10101, "Pedro", "Engenharia de Software", "Primeiro"),
            new AlunoResponse(10102, "Felipe", "Engenharia de Dados", "Terceiro"),
            new AlunoResponse(10103, "Davi", "Engenharia da Computação", "Quinto"),
            new AlunoResponse(10104, "Fred", "Engenharia Mecanica", "Quinto"),
            new AlunoResponse(10105, "Eduardo", "Engenharia Civil", "Primeiro"),
            new AlunoResponse(10106, "Maria", "Engenharia da Computação", "Terceiro"),
            new AlunoResponse(10107, "Ana", "Engenharia de Dados", "Quinto"),
            new AlunoResponse(10108, "Debora", "Engenharia Mecanica", "Quinto"),
            new AlunoResponse(10109, "Lucas", "Engenharia Civil", "Primeiro")
    );

    public InfoResponse getInfo() {
        String mensagem = "Sistema está rodando";

        return new InfoResponse(nomeProjeto,
                System.getProperty("java.version"),
                versaoProjeto,
                LocalDateTime.now().toString(),
                mensagem);
    }

    public List<CursoResponse> listarCursos() {
        return cursos;
    }

    public CursoResponse buscarCursoPorId(int id) {
        return cursos.stream().filter(c -> c.getIdCurso() == id).findFirst().orElse(null);
    }

    public AlunoResponse buscarInfoAlunoPorMatricula(int matricula) {
        return alunos.stream().filter(a -> a.getMatricula() == matricula).findFirst().orElse(null);
    }

    public List<AlunoResponse> buscarAlunosPorPeriodo(String semestre) {
        return alunos.stream().filter(a -> a.getSemestre().contains(semestre)).toList();
    }

}
