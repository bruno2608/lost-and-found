package br.una.lostandfound.entities.usecases.services;

import br.una.lostandfound.entities.usecases.dto.requests.PosterCreateRequest;
import br.una.lostandfound.entities.usecases.dto.responses.PosterResponse;

import java.util.List;
import java.util.UUID;

public interface PosterService {

    PosterResponse findOne(UUID posterId) throws Exception;

    List<PosterResponse> findAll();

    PosterResponse save(PosterCreateRequest request) throws Exception;
}
