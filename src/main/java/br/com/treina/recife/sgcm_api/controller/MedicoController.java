package br.com.treina.recife.sgcm_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treina.recife.sgcm_api.model.Medico;
import br.com.treina.recife.sgcm_api.service.MedicoService;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService service;

    // Listar todos os médicos
    @GetMapping
    public ResponseEntity<List<Medico>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    // Buscar médico por ID
    @GetMapping("/{id}")
    public ResponseEntity<Medico> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    // Cadastrar médico
    @PostMapping
    public ResponseEntity<Medico> salvar(@RequestBody Medico medico) {
        Medico novoMedico = service.salvar(medico);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoMedico);
    }

    // Atualizar médico
    @PutMapping("/{id}")
    public ResponseEntity<Medico> atualizar(@PathVariable Long id,
            @RequestBody Medico medico) {
        Medico medicoAtualizado = service.atualizar(medico);
        return ResponseEntity.ok(medicoAtualizado);
    }

    // Excluir médico
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}