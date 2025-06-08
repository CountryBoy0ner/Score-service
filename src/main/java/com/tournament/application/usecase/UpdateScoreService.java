package com.tournament.application.usecase;


import com.tournament.application.repository.ScoreRepository;
import com.tournament.domain.model.Score;

import java.time.LocalDateTime;
import java.util.UUID;

public class UpdateScoreService implements UpdateScoreUseCase {

    private final ScoreRepository scoreRepository;

    public UpdateScoreService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @Override
    public void updateScore(UUID matchId, int player1Score, int player2Score) throws Exception {
        Score existing = scoreRepository.findByMatchId(matchId)
                .orElseThrow(() -> new Exception("Score not found for matchId: " + matchId));
        existing.setPlayer1Score(player1Score);
        existing.setPlayer2Score(player2Score);
        existing.setSubmittedAt(LocalDateTime.now());
        scoreRepository.save(existing);
    }
}