package br.com.treina.recife.sgcm_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.treina.recife.sgcm_api.model.Especialidade;
import br.com.treina.recife.sgcm_api.repository.EspecialidadeRepository;

@Service
public class EspecialidadeService {

    private final EspecialidadeRepository repository;

    public EspecialidadeService(EspecialidadeRepository repository) {
        this.repository = repository;
    }

    public List<Especialidade> listarTodos() {
        return repository.findAll();
    }

    public Especialidade buscarPorId(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Especialidade salvar(Especialidade especialidade) {
        return repository.save(especialidade);
    }

    public Especialidade atualizar(Long id, Especialidade especialidade) {

        Especialidade existente = buscarPorId(id);

        existente.setNome(especialidade.getNome());
        existente.setDescricao(especialidade.getDescricao());

        return repository.save(existente);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

}