package br.una.lostandfound.entities.mappers;

import br.una.lostandfound.entities.domain.Poster;
import br.una.lostandfound.entities.usecases.dto.requests.PosterCreateRequest;
import br.una.lostandfound.entities.usecases.dto.responses.PosterResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = Exception.class)
public interface PosterDTOMapper {

    PosterDTOMapper MAPPER = Mappers.getMapper(PosterDTOMapper.class);

    Poster toDomain(PosterCreateRequest dto) throws Exception;

    PosterResponse toDTO(Poster domain);

    List<PosterResponse> toDTO(List<Poster> posters);
}
