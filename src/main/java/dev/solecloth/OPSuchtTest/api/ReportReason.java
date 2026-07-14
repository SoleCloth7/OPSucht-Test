package dev.solecloth.OPSuchtTest.api;

public enum ReportReason {
    // Report Gründe

    CHEATING(
            "Verdacht auf Cheats/Hacks/Illegale Modifikationen",
            false
    ),
    INSULT(
            "Beleidigung/Toxisches Verhalten gegenüber anderen",
           false
   ),

    BUGUSING(
            "Ausnutzen von Bugs oder ähnlichem",
            false
    ),

    GRIEFING(
            "Zerstörung von Bauwerken",
            false
    ),

    SPAM(
            "Chat Spam/Werbung",
            false
    ),

    OTHER(
            "Sonstiges",
            true
    );


    private final String description;
    private final boolean requiresText;

    ReportReason(String description, boolean requiresText) {
        this.description = description;
        this.requiresText = requiresText;
    }

    public String description() {
        return description;
    }

    public boolean requiresText() {
        return requiresText;
    }
}
