package br.com.treina.recife.sgcm_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.treina.recife.sgcm_api.model.Paciente;
import br.com.treina.recife.sgcm_api.repository.PacienteRepository;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public List<Paciente> listarTodos() {
        return repository.findAll();
    }

    public Paciente buscarPorId(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }

    public Paciente atualizar(Long id, Paciente paciente) {

        Paciente existente = buscarPorId(id);

        existente.setNome(paciente.getNome());
        existente.setCpf(paciente.getCpf());
        existente.setEmail(paciente.getEmail());
        existente.setTelefone(paciente.getTelefone());
        existente.setDataNascimento(paciente.getDataNascimento());
        existente.setAtivo(paciente.getAtivo());

        return repository.save(existente);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}