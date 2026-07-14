package dev.solecloth.OPSuchtTest.api;

import java.util.concurrent.CompletableFuture;

public interface PlayerLookupService {

    /**
     * Sucht einen Java- oder Bedrock-Spieler
     * @param playerName eingegebener Name des Spielers
     * @return zukünftige Spieleridentität
     */

    CompletableFuture<PlayerIdentity> findPlayer(String playerName);
}