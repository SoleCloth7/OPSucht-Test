package dev.solecloth.OPSuchtTest.api;

public enum PlayerEdition {

    // Java Edition und Bedrock Edition
    JAVA("java"),
    BEDROCK("bedrock");

    private final String apiName;

    PlayerEdition(String apiName) {
        this.apiName = apiName;
    }

    /**
     * Gibt den Namen zurück den die API erwartet
     * @return java oder bedrock
     */

    public String apiName() {
        return apiName;
    }
}