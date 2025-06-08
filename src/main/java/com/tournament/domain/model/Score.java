package com.tournament.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;
@Getter
@Setter
public class Score {

    private UUID id;
    private UUID matchId;
    private int player1Score;
    private int player2Score;
    private LocalDateTime submittedAt;

    public Score() {}

    public Score(UUID id, UUID matchId, int player1Score, int player2Score, LocalDateTime submittedAt) {
        this.id = id;
        this.matchId = matchId;
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.submittedAt = submittedAt;
    }



}
