package br.una.lostandfound.entities.usecases.services;

import br.una.lostandfound.entities.domain.Poster;
import br.una.lostandfound.entities.mappers.PosterDTOMapper;
import br.una.lostandfound.entities.repository.PosterRepository;
import br.una.lostandfound.entities.usecases.dto.requests.PosterCreateRequest;
import br.una.lostandfound.entities.usecases.dto.responses.PosterResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class PosterServiceImpl implements PosterService {

    @Autowired
    PosterRepository repository;

    @Override
    public PosterResponse findOne(UUID posterId) throws Exception {
        Poster poster = repository.getOne(posterId);
        return PosterDTOMapper.MAPPER.toDTO(poster);
    }

    @Override
    public List<PosterResponse> findAll() {
        List<Poster> posters = repository.getAll();
        return PosterDTOMapper.MAPPER.toDTO(posters);
    }

    @Override
    public PosterResponse save(PosterCreateRequest request) throws Exception {
        var savedPoster = repository.save(PosterDTOMapper.MAPPER.toDomain(request));
        return PosterDTOMapper.MAPPER.toDTO(savedPoster);
    }
}
