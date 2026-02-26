package dev.java10x.api.controller;

import dev.java10x.api.dto.InfoResponse;
import dev.java10x.api.dto.CursoResponse;
import dev.java10x.api.dto.AlunoResponse;
import dev.java10x.api.service.ApiService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final ApiService apiService;

    @GetMapping("/sistema/info")
    public ResponseEntity<InfoResponse> info() {
        return ResponseEntity.ok(apiService.getInfo());
    }

    @GetMapping("/cursos")
    public ResponseEntity<List<CursoResponse>> cursos() {
        return ResponseEntity.ok(apiService.listarCursos());
    }

    @GetMapping("/cursos/{idCurso}")
    public ResponseEntity<CursoResponse> buscarCurso(@PathVariable int idCurso) {

        CursoResponse curso = apiService.buscarCursoPorId(idCurso);

        if (curso == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(curso);
    }

    @GetMapping("/estudantes/{matricula}")
    public ResponseEntity<AlunoResponse> buscarAluno(@PathVariable int matricula) {

        AlunoResponse aluno = apiService.buscarInfoAlunoPorMatricula(matricula);

        if (aluno == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(aluno);
    }

    @GetMapping("/estudantes/semestre/{semestre}")
    public ResponseEntity<List<AlunoResponse>> buscarAlunosSemestre(@PathVariable String semestre) {

        List<AlunoResponse> alunos = apiService.buscarAlunosPorPeriodo(semestre);

        return ResponseEntity.ok(alunos);
    }

}
