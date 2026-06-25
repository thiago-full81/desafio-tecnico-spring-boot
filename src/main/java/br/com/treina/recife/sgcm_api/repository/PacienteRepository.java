package br.com.treina.recife.sgcm_api.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.treina.recife.sgcm_api.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    Optional<Paciente> findBynome(String nome);

    Optional<Paciente> findBycpf(String cpf);

    Optional<Paciente> findByemail(String email);

    Optional<Paciente> findBytelefone(String telefone);

    Optional<Paciente> findBydataNascimento(LocalDate dataNascimento);

    Optional<Paciente> findByativo(String ativo);

}