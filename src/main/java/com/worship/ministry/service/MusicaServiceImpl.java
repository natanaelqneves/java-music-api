package com.worship.ministry.service;

import com.worship.ministry.model.Musica;
import com.worship.ministry.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaServiceImpl implements MusicaService {

    @Autowired
    private MusicaRepository musicaRepository;

    @Override
    public List<Musica> verTodas() {
        return this.musicaRepository.findAll();
    }

    @Override
    public Musica adicionar(Musica musica) {
        return this.musicaRepository.save(musica);
    }
}
