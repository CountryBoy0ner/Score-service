package com.tournament.application.usecase;

import java.util.UUID;

public interface UpdateScoreUseCase {
    void updateScore(UUID matchId, int player1Score, int player2Score) throws Exception;
}