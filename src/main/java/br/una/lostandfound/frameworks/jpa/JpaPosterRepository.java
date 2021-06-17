package br.una.lostandfound.frameworks.jpa;

import br.una.lostandfound.frameworks.entities.PosterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaPosterRepository extends JpaRepository<PosterEntity, UUID> {

}
