package br.com.treina.recife.sgcm_api.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.treina.recife.sgcm_api.model.Prescricao;

@Repository
public interface PrescricaoRepository extends JpaRepository<Prescricao, Long> {

    Optional<Prescricao> findBydescricao(String descricao);

    Optional<Prescricao> findBymedicamentos(String medicamentos);

    Optional<Prescricao> findBydataEmissao(LocalDate dataEmissao);
}