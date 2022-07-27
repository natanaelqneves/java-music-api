package com.worship.ministry.service;

import com.worship.ministry.model.Musica;
import com.worship.ministry.repository.MusicaRepository;

import java.util.List;

public interface MusicaService {

    public List<Musica> verTodas();

    public Musica adicionar(Musica musica);
}
