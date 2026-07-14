package dev.solecloth.OPSuchtTest.api;

import java.util.Objects;
import java.util.UUID;

public record CreateReportRequest(
        UUID reporter,
        String reporterName,
        UUID reported,
        String reportedName,
        String reason,
        String server
) {


    public CreateReportRequest {
        Objects.requireNonNull(reporter, "Der reporter darf nicht null sein.");
        Objects.requireNonNull(reported, "Der name des reporteten darf nicht null sein.");
        Objects.requireNonNull(
                reporterName,
                "reporterName darf nicht null sein."
        );
        Objects.requireNonNull(
                reportedName,
                "reportedName darf nicht null sein."
        );
        Objects.requireNonNull(reason, "Der Grund darf nicht null sein.");
        Objects.requireNonNull(server, "Der Server darf nicht null sein.");

        if (reporter.equals(reported)) {
            throw new IllegalArgumentException(
                    "Ein Spieler darf sich nicht selbst melden."
            );
        }

        if (reporterName.isBlank()) {
            throw new IllegalArgumentException(
                    "Der Name des Reporters darf nicht leer sein."
            );
        }

        if (reportedName.isBlank()) {
            throw new IllegalArgumentException(
                    "Der Name des gemeldeten Spielers darf nicht leer sein."
            );
        }

        if (reason.isBlank()) {
            throw new IllegalArgumentException(
                    "Der Report Grund darf nicht leer sein."
            );
        }

        if (server.isBlank()) {
            throw new IllegalArgumentException(
                    "Der Server Name darf nicht leer sein."
            );
        }
    }
}