package br.com.treina.recife.sgcm_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.treina.recife.sgcm_api.model.Prescricao;
import br.com.treina.recife.sgcm_api.repository.PrescricaoRepository;

@Service
public class PrescricaoService {

    private final PrescricaoRepository repository;

    public PrescricaoService(PrescricaoRepository repository) {
        this.repository = repository;
    }

    public List<Prescricao> listarTodos() {
        return repository.findAll();
    }

    public Prescricao buscarPorId(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Prescricao salvar(Prescricao prescricao) {
        return repository.save(prescricao);
    }

    public Prescricao atualizar(Long id, Prescricao prescricao) {

        Prescricao existente = buscarPorId(id);

        existente.setDescricao(prescricao.getDescricao());
        existente.setMedicamentos(prescricao.getMedicamentos());
        existente.setDataEmissao(prescricao.getDataEmissao());
        existente.setConsulta(prescricao.getConsulta());

        return repository.save(existente);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

}