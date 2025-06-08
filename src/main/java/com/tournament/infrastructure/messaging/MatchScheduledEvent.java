package com.tournament.infrastructure.messaging;


import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MatchScheduledEvent {
    private UUID matchId;
    private UUID tournamentId;
    private UUID player1Id;
    private UUID player2Id;
    private LocalDateTime scheduledTime;
}