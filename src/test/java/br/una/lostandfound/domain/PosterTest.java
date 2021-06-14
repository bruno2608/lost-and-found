package br.una.lostandfound.domain;

import br.una.lostandfound.enums.BelongingType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PosterTest {
    final Reporter reporter = new Reporter("reporter");
    final Reporter bearer = new Reporter("bearer");
    private final List<Belongs> belongings = new ArrayList<>();


    @BeforeEach
    void setUp() {
        belongings.add(Belongs.builder().bearer(bearer).type(BelongingType.FEDERAL_DOCUMENT).build());
    }

    @Test
    @DisplayName("Valid poster")
    void shouldCreateAValidPoster() throws Exception {
        final Poster poster = new Poster(reporter, belongings, "", "", "");
        assertNotNull(poster);
    }

    @Test
    @DisplayName("Invalid poster")
    void shouldThrowExceptionNullBelongings() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> {
            new Poster(reporter, null, "", "", "");
        }, "teste");

        assertEquals("Necessário pertences para reportar", exception.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}