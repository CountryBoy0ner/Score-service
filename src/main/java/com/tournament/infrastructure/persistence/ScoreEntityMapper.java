package com.tournament.infrastructure.persistence;


import com.tournament.domain.model.Score;

public class ScoreEntityMapper {

    public static ScoreEntity toEntity(Score score) {
        return ScoreEntity.builder()
                .id(score.getId())
                .matchId(score.getMatchId())
                .player1Score(score.getPlayer1Score())
                .player2Score(score.getPlayer2Score())
                .submittedAt(score.getSubmittedAt())
                .build();
    }

    public static Score toDomain(ScoreEntity entity) {
        return new Score(
                entity.getId(),
                entity.getMatchId(),
                entity.getPlayer1Score(),
                entity.getPlayer2Score(),
                entity.getSubmittedAt()
        );
    }
}