package br.com.treina.recife.sgcm_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treina.recife.sgcm_api.model.Consulta;
import br.com.treina.recife.sgcm_api.service.ConsultaService;

@RestController
@RequestMapping(value = "/api/consulta")
public class ConsultaController {
@Autowired
    private ConsultaService service;

    // CREATE
    @PostMapping
    public Consulta criar(@RequestBody Consulta consulta) {
        return service.salvar(consulta);
    }

    // READ - Listar todos
    @GetMapping
    public List<Consulta> listarTodos() {
        return service.listarTodos();
    }

    // READ - Buscar por ID
    @GetMapping("/{id}")
    public Consulta buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Consulta atualizar(@PathVariable Long id,
                             @RequestBody Consulta consulta) {
        return service.atualizar(id, consulta);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}

