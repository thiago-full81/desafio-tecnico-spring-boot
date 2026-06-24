package br.com.treina.recife.sgcm_api.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.treina.recife.sgcm_api.enums.StatusConsulta;
import br.com.treina.recife.sgcm_api.model.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    Optional<Consulta> findBydataHora(LocalDate dataHora);

    Optional<Consulta> findByStatusConsulta(StatusConsulta status);

    Optional<Consulta> findByobservacoes(String observacoes);
}