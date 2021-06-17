package br.una.lostandfound.frameworks.entities;

import br.una.lostandfound.entities.domain.Reporter;
import br.una.lostandfound.entities.enums.BelongingType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BelongsEntity {

    @Id
    private UUID uuid;

    @ManyToOne
    private Reporter bearer;

    private BelongingType type;
}
