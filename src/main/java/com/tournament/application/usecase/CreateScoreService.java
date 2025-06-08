package com.tournament.application.usecase;

import com.tournament.application.repository.ScoreRepository;
import com.tournament.domain.model.Score;
import com.tournament.infrastructure.messaging.MatchScheduledEvent;

import java.time.LocalDateTime;
import java.util.UUID;

public class CreateScoreService implements CreateScoreUseCase {

    private final ScoreRepository scoreRepository;

    public CreateScoreService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @Override
    public void createScore(Score score) {
        scoreRepository.save(score);
    }

    @Override
    public void createFromMatchScheduledEvent(MatchScheduledEvent event) {
        Score score = new Score(
                UUID.randomUUID(),
                event.getMatchId(),
                0,
                0,
                LocalDateTime.now()
        );
        scoreRepository.save(score);
    }
}