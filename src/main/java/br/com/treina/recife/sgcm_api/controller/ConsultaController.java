package br.com.treina.recife.sgcm_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService service;

    @GetMapping
    public List<Consulta> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Consulta buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Consulta salvar(@RequestBody Consulta consulta) {
        return service.salvar(consulta);
    }

    @PutMapping("/{id}")
    public Consulta atualizar(@PathVariable Long id,
            @RequestBody Consulta consulta) {

        return service.atualizar(id, consulta);
    }
}
