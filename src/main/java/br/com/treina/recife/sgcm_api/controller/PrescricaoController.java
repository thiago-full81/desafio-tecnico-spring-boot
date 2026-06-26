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

import br.com.treina.recife.sgcm_api.model.Prescricao;
import br.com.treina.recife.sgcm_api.service.PrescricaoService;

@RestController
@RequestMapping("/prescricoes")
public class PrescricaoController {

    @Autowired
    private PrescricaoService service;

    @GetMapping
    public List<Prescricao> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Prescricao buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Prescricao salvar(@RequestBody Prescricao prescricao) {
        return service.salvar(prescricao);
    }

    @PutMapping("/{id}")
    public Prescricao atualizar(@PathVariable Long id,
            @RequestBody Prescricao prescricao) {

        return service.atualizar(id, prescricao);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }

}