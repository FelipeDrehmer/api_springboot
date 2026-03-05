package dev.java10x.api.dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoResponse {

    private String nomeProjeto;
    private String versaoJava;
    private String versaoProjeto;
    private String dataHoraSistema;
    private String mensagemSucesso;

    public InfoResponse(String nomeProjeto, String versaoJava, String versaoProjeto, String dataHoraSistema, String mensagemSucesso) {
        this.nomeProjeto = nomeProjeto;
        this.versaoJava = versaoJava;
        this.versaoProjeto = versaoProjeto;
        this.dataHoraSistema = dataHoraSistema;
        this.mensagemSucesso = mensagemSucesso;
    }

}
