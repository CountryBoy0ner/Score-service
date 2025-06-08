package com.tournament.infrastructure.messaging;

import com.tournament.application.repository.ScoreRepository;
import com.tournament.domain.model.Score;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class MatchScheduledListener {
//
//    private final ScoreRepository scoreRepository;
//
//    public MatchScheduledListener(ScoreRepository scoreRepository) {
//        this.scoreRepository = scoreRepository;
//    }
//
//    @KafkaListener(topics = "match-scheduled", groupId = "score-service", containerFactory = "kafkaListenerContainerFactory")
//    public void handleMatchScheduled(MatchScheduledEvent event) {
//        Score score = new Score(
//                UUID.randomUUID(),
//                event.getMatchId(),
//                0,
//                0,
//                LocalDateTime.now()
//        );
//
//        scoreRepository.save(score);
//    }
}
