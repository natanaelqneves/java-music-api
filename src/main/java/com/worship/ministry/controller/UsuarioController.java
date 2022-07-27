package com.worship.ministry.controller;

import com.worship.ministry.model.Usuario;
import com.worship.ministry.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> verTodos(){
        return this.usuarioService.verTodos();
    }

    @GetMapping()
    public Usuario adicionar(Usuario usuario) {
        return this.usuarioService.adicionar(usuario);
    }
}
