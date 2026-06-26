package br.com.treina.recife.sgcm_api.dtos;

import java.time.LocalDate;

public record DadosPrescricao(
    Long id,
    String descricao,
    String medicamentos,
    LocalDate dataEmissao

) {
}
