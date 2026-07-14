package dev.solecloth.OPSuchtTest.api;

import java.util.Objects;
import java.util.UUID;

public record PlayerIdentity(
        UUID uuid,
        String name,
        PlayerEdition edition
) {

    public PlayerIdentity {
        Objects.requireNonNull(uuid, "die UUID darf nicht null sein.");
        Objects.requireNonNull(name, "der Name darf nicht null sein.");
        Objects.requireNonNull(name, "die Edition darf nicht null sein.");

        if (name.isBlank()) {
            throw new IllegalArgumentException(
                    "Der name des Spielers darf nicht leer sein."
                    );
        }
    }
}