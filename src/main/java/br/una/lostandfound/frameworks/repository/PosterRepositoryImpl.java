package br.una.lostandfound.frameworks.repository;

import br.una.lostandfound.entities.domain.Poster;
import br.una.lostandfound.entities.repository.PosterRepository;
import br.una.lostandfound.frameworks.entities.PosterEntity;
import br.una.lostandfound.frameworks.jpa.JpaPosterRepository;
import br.una.lostandfound.frameworks.mappers.PosterEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

public class PosterRepositoryImpl implements PosterRepository {

    @Autowired
    private JpaPosterRepository repository;

    @Override
    public Poster getOne(UUID posterId) throws Exception {
        var posterOptional = repository.findById(posterId);
        if (posterOptional.isEmpty()) {
            throw new Exception(String.valueOf(Poster.ErrorMessage.NOT_FOUND));
        }
        return PosterEntityMapper.MAPPER.toDomain(posterOptional.get());
    }

    @Override
    public List<Poster> getAll() {
        final List<PosterEntity> entities = repository.findAll(Sort.by(Sort.Order.desc("posterDate")));
        return entities.stream()
                .filter(Objects::nonNull)
                .map(entity -> {
                    try {
                        return PosterEntityMapper.MAPPER.toDomain(entity);
                    } catch (Exception e) {
                        throw new RuntimeException("Falha ao mapear");
                    }
                })
                .collect(Collectors.toList());
    }

    @Override
    public Poster save(Poster poster) throws Exception {
        final PosterEntity savedPoster = repository.save(PosterEntityMapper.MAPPER.toEntity(poster));
        return PosterEntityMapper.MAPPER.toDomain(savedPoster);
    }

}
