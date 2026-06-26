package br.com.treina.recife.sgcm_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.treina.recife.sgcm_api.model.Consulta;
import br.com.treina.recife.sgcm_api.repository.ConsultaRepository;

@Service
public class ConsultaService {

    private final ConsultaRepository repository;

    public ConsultaService(ConsultaRepository repository) {
        this.repository = repository;
    }

    public List<Consulta> listarTodos() {
        return repository.findAll();
    }

    public Consulta buscarPorId(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Consulta salvar(Consulta consulta) {
        return repository.save(consulta);
    }

    public Consulta atualizar(Long id, Consulta consulta) {

        Consulta existente = buscarPorId(id);

        existente.setDataHora(consulta.getDataHora());
        existente.setStatus(consulta.getStatus());
        existente.setObservacoes(consulta.getObservacoes());
        existente.setMedico(consulta.getMedico());
        existente.setPaciente(consulta.getPaciente());

        return repository.save(existente);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

}