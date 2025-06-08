package com.tournament.infrastructure.messaging;

import com.tournament.application.repository.ScoreRepository;
import com.tournament.application.usecase.CreateScoreUseCase;
import com.tournament.domain.model.Score;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class MatchScheduledListener {

    private final CreateScoreUseCase createScoreUseCase;

    public MatchScheduledListener(CreateScoreUseCase createScoreUseCase) {
        this.createScoreUseCase = createScoreUseCase;
    }

    @KafkaListener(topics = "match-scheduled", groupId = "score-service", containerFactory = "kafkaListenerContainerFactory")
    public void handleMatchScheduled(MatchScheduledEvent event) {
        createScoreUseCase.createFromMatchScheduledEvent(event);
    }
}
