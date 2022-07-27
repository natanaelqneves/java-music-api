package com.worship.ministry.controller;

import com.worship.ministry.model.Musica;
import com.worship.ministry.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    private MusicaService musicaService;

    @GetMapping
    public List<Musica> verTodas() {
        return this.musicaService.verTodas();
    }

    @PostMapping
    public Musica adicionar(Musica musica) {
        return this.musicaService.adicionar(musica);

    //@PostMapping(path = "", consumes = "application/x-www-form-urlencoded")
    //public Musica adicionar(Musica musica) {
    //    return this.musicaService.adicionar(musica);
    }
}
