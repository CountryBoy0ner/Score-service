package com.tournament.presentation.dto;


import java.time.LocalDateTime;
import java.util.UUID;

public class ScoreResponse {

    private UUID matchId;
    private int player1Score;
    private int player2Score;
    private LocalDateTime submittedAt;

    public ScoreResponse(UUID matchId, int player1Score, int player2Score, LocalDateTime submittedAt) {
        this.matchId = matchId;
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.submittedAt = submittedAt;
    }

    public UUID getMatchId() {
        return matchId;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }
}