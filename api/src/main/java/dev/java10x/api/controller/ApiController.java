package dev.java10x.api.controller;

import dev.java10x.api.dto.InfoResponse;
import dev.java10x.api.service.ApiService;
import java.util.List;
import java.util.ArrayList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public ResponseEntity<List<String>> cursos() {
        return ResponseEntity.ok(apiService.listarCursos());
    }

}
