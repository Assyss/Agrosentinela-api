package com.agrosentinela.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.agrosentinela.api.model.medicao;
import com.agrosentinela.api.repository.MedicaoRepository;

@RestController
@RequestMapping("/medicoes")
public class MedicaoController {

    @Autowired
    private MedicaoRepository repository;

    @GetMapping
    public List<medicao> listar() {
        return repository.findAll();
    }

    @PostMapping
    public medicao cadastrar(@RequestBody medicao medicao) {
        return repository.save(medicao);
    }
}
