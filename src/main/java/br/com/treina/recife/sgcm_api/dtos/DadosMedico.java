package br.com.treina.recife.sgcm_api.dtos;

public record DadosMedico(
Long id,

String nome,

String crm,

String email,

String telefone,

Boolean ativo
) {
}
