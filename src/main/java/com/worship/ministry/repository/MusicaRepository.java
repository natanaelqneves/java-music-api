package com.worship.ministry.repository;

import com.worship.ministry.model.Musica;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusicaRepository extends MongoRepository<Musica, String> {
}
