package dev.solecloth.OPSuchtTest.api;


import java.time.Instant;
import java.util.UUID;

/**
 * Plattformunabhängige Ansicht eines Reports
 *
 * Das API-Modul verwendet keine MongoDB Klassen wie z.B ObjectID
 * Deshalb wird die Report-ID als String gespeichert.
 */
public record ReportView(
    String id,
    UUID reporter,
    UUID reported,
    String reporterName,
    String reportedName,
    String reason,
    ReportStatus status,
    String server,
    Instant createdAt,
    UUID handledby,
    String handledbyName,
    String StaffNote,
    Instant handledat
) {

}