package dev.solecloth.OPSuchtTest.api;

import java.time.Instant;

// Redis nachricht für einen neu gemmachten report.
public record NewReportEvent(
        String reportId,
        String reporter,
        String reported,
        String reason,
        String server,
        Instant timestamp
)
{

}