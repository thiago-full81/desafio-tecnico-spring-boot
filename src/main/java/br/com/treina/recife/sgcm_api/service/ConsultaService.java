package br.com.treina.recife.sgcm_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treina.recife.sgcm_api.dtos.DadosConsulta;
import br.com.treina.recife.sgcm_api.model.Consulta;
import br.com.treina.recife.sgcm_api.repository.ConsultaRepository;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;

    public List<DadosConsulta> listarcConsultas() {
        return consultaRepository.findAll()
                .stream().map(consulta -> converterParaDTO(consulta)).toList();
    }

    public DadosConsulta buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Consulta não encontrado"));
    }

    public DadosConsulta salvarConsulta(Consulta consulta) {
        return converterParaDTO(consultaRepository.save(consulta));
    }

    public Consulta atualizar(Long id, Consulta Consulta) {
        Consulta existente = buscarPorId(id);

        existente.setNome(Consulta.getNome());
        existente.setDescricao(Consulta.getDescricao());

        return repository.save(existente);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}