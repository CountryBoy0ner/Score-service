package com.tournament.application.usecase;

import com.tournament.application.repository.ScoreRepository;
import com.tournament.domain.model.Score;

public class CreateScoreService implements CreateScoreUseCase {

    private final ScoreRepository scoreRepository;

    public CreateScoreService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @Override
    public void createScore(Score score) {
        scoreRepository.save(score);
    }
}