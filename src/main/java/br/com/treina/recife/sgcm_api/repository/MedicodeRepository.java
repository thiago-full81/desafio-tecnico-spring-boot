package br.com.treina.recife.sgcm_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.treina.recife.sgcm_api.model.Medico;

@Repository
public interface MedicodeRepository extends JpaRepository<Medico, Long> {

    Optional<Medico> findBynome(String nome);

    Optional<Medico> findBycrm1(String crm);

    Optional<Medico> findByemail(String email);

    Optional<Medico> findBytelefone(String telefone);

    Optional<Medico> findByativo(String ativo);

}
