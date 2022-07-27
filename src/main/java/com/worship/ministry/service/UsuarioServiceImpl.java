package com.worship.ministry.service;

import com.worship.ministry.model.Usuario;
import com.worship.ministry.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> verTodos() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario adicionar(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }
}
