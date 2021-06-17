package br.una.lostandfound.frameworks.mappers;

import br.una.lostandfound.entities.domain.Poster;
import br.una.lostandfound.frameworks.entities.PosterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PosterEntityMapper {

    PosterEntityMapper MAPPER = Mappers.getMapper(PosterEntityMapper.class);

    Poster toDomain(PosterEntity entity) throws Exception;

    PosterEntity toEntity(Poster domain);
}
