package br.com.treina.recife.sgcm_api.dtos;

import java.time.LocalDate;

public record DadosPaciente(
Long id,

String nome,

String cpf,

String email,

String telefone,

LocalDate dataNascimento,

Boolean ativo) {
} 
