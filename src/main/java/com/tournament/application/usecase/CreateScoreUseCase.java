package com.tournament.application.usecase;


import com.tournament.domain.model.Score;

public interface CreateScoreUseCase {
    void createScore(Score score);
}