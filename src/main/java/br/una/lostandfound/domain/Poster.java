package br.una.lostandfound.domain;

import lombok.Data;

import java.util.List;

/**
 * Poster ou Anúncio, representação em domínio.
 * @author Maxwel
 */
@Data
public class Poster {
    private Reporter reporter;
    private List<Belongs> belongings;
    private String message;
    private String adressFound;
    private String adressToPickup;

    public Poster(Reporter reporter, List<Belongs> belongings, String message, String adressFound, String adressToPickup) throws Exception {
        if (belongings == null || belongings.isEmpty()) throw new Exception("Necessário pertences para reportar");
        if (reporter == null) throw new Exception("Informe o relator");
        this.reporter = reporter;
        this.belongings = belongings;
        this.message = message;
        this.adressFound = adressFound;
        this.adressToPickup = adressToPickup;
    }
}
