package com.worship.ministry.repository;

import com.worship.ministry.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository  extends MongoRepository<Usuario, String> {
}
