package br.com.treina.recife.sgcm_api.dtos;

import java.time.LocalDateTime;

import br.com.treina.recife.sgcm_api.enums.StatusConsulta;

public record DadosConsulta(
        Long id,
        LocalDateTime dataHora,
        StatusConsulta status,
        String observaçoes

) {
}