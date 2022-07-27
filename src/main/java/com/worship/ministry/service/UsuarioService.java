package com.worship.ministry.service;

import com.worship.ministry.model.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> verTodos();

    public Usuario adicionar(Usuario usuario);
}
