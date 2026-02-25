package dev.java10x.api.dto;

import lombok.Getter;

@Getter
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
