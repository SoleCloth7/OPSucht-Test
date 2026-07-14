package dev.solecloth.OPSuchtTest.api;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

// Öffentliche Schnitstelle für die Verwaltung von Reports

public interface ReportService {
    // Erstellt einen Report
    CompletableFuture<ReportView> createReport(
            CreateReportRequest request
    );

    // Sucht einen Report anhand ReportID
    CompletableFuture<Optional<ReportView>> findReport(
            String reportId
    );

    // Gibt offene Reports zurück
    CompletableFuture<List<ReportView>> findOpenReports(
            int limit
    );

    // Schließt einen Report als richtig ab
    CompletableFuture<ReportView> resolveReport(
            String reportId,
            UUID staff,
            String staffName
    );

    // Lehnt einen Report mit Begründung ab
    CompletableFuture<ReportView> rejectReport(
            String reportId,
            UUID staff,
            String staffName,
            String reason
    );
    // Zeigt die Zahl der Offenen Reports an
    CompletableFuture<Long> countOpenReports();
}
