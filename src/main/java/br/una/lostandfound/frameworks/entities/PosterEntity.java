package br.una.lostandfound.frameworks.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PosterEntity {

    @Id
    private UUID uuid;

    @OneToMany
    private List<BelongsEntity> belongings;

    private String message;

    private String adressFound;

    private String adressToPickup;

    private LocalDateTime posterDate;

}
