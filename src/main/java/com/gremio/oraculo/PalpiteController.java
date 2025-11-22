package com.gremio.oraculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/palpites")
public class PalpiteController {

    @Autowired
    private PalpiteRepository repository;

    // CONSULTAR (GET)
    @GetMapping
    public List<Palpite> listarTodos() {
        return repository.findAll();
    }

    // INSERIR (POST)
    @PostMapping
    public Palpite criar(@RequestBody Palpite novoPalpite) {
        return repository.save(novoPalpite);
    }
}