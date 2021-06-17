package br.una.lostandfound.entities.repository;

import br.una.lostandfound.entities.domain.Poster;

import java.util.List;
import java.util.UUID;

public interface PosterRepository {

    Poster getOne(UUID posterId) throws Exception;

    List<Poster> getAll();

    Poster save(Poster poster) throws Exception;
}
