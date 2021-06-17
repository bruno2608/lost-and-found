package br.una.lostandfound.entities.domain;

import br.una.lostandfound.entities.enums.BelongingType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Belongs {
    private Reporter bearer;
    private BelongingType type;

    public Belongs(Reporter bearer, BelongingType type) {
        this.bearer = bearer;
        this.type = type;
    }
}