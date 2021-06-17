package br.una.lostandfound.entities.usecases.dto.responses;

import br.una.lostandfound.entities.domain.Belongs;
import br.una.lostandfound.entities.domain.Reporter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PosterResponse {
    private UUID uuid;
    private Reporter reporter;
    private List<Belongs> belongings;
    private String message;
    private String adressFound;
    private String adressToPickup;
}
