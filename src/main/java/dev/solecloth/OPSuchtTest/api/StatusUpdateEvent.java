package dev.solecloth.OPSuchtTest.api;

// Redis Nachricht für einen bearbeiteten report

import java.time.Instant;
import java.util.UUID;

public record StatusUpdateEvent(
        String eventId,
        String reportId,
        UUID reporterUUID,
        String reporterName,
        String reportedName,
        ReportStatus status,
        String handledby,
        String StaffNote,
        Instant timestamp
)
{

}