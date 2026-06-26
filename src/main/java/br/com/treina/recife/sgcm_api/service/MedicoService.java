package br.com.treina.recife.sgcm_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treina.recife.sgcm_api.model.Medico;
import br.com.treina.recife.sgcm_api.repository.MedicodeRepository;

@Service
public class MedicoService {

    @Autowired
    private MedicodeRepository repository;

    public List<Medico> listarTodos() {
        return repository.findAll();
    }

    public Medico buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow();
    }

    public Medico atualizar(Medico medico) {
        return repository.atualizar(medico);
    }

    public Medico salvar(Medico medico) {
        return repository.save(medico);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

}
