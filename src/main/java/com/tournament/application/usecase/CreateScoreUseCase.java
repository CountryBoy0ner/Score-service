package com.tournament.application.usecase;


import com.tournament.domain.model.Score;
import com.tournament.infrastructure.messaging.MatchScheduledEvent;

public interface CreateScoreUseCase {
    void createScore(Score score);
    void createFromMatchScheduledEvent(MatchScheduledEvent event);

}