package dev.java10x.api.service;

import dev.java10x.api.dto.InfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ApiService {

    @Value("${spring.application.name}")
    private String nomeProjeto;

    @Value("${spring.application.version}")
    private String versaoProjeto;

    public InfoResponse getInfo() {

        String mensagem = "Sistema está rodando";

        return new InfoResponse(nomeProjeto,
                System.getProperty("java.version"),
                versaoProjeto,
                LocalDateTime.now().toString(),
                mensagem);
    }

    public List<String> listarCursos() {

        List<String> cursosAtivos = new ArrayList<String>();

        cursosAtivos.add("Engenharia de Software");
        cursosAtivos.add("Engenharia da Computação");
        cursosAtivos.add("Engenharia Civil");
        cursosAtivos.add("Engenharia Mecanica");
        cursosAtivos.add("Engenharia de Dados");

        return cursosAtivos;
    }


}
