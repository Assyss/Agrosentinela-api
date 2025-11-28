package com.agrosentinela.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.agrosentinela.api.model.Fazenda;
import com.agrosentinela.api.repository.FazendaRepository;

@RestController // Diz que esta classe recebe requisições Web
@RequestMapping("/fazendas") // O endereço será: http://localhost:8080/fazendas
public class FazendaController {

    @Autowired // Injeção de Dependência (O Spring cria o Repository para ti)
    private FazendaRepository repository;

    // GET: Listar todas
    @GetMapping
    public List<Fazenda> listar() {
        return repository.findAll();
    }

    // POST: Criar nova
    @PostMapping
    public Fazenda cadastrar(@RequestBody Fazenda fazenda) {
        return repository.save(fazenda);
    }
}