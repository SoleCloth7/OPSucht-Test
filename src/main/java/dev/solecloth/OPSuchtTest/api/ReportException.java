package dev.solecloth.OPSuchtTest.api;

// Beschreibt einen erwarteten Fehler innerhalb des Systems

public final class ReportException extends RuntimeException {

    public ReportException(String message) {
        super(message);
    }

    public ReportException(String message, Throwable cause) {
        super(message, cause);
    }

}