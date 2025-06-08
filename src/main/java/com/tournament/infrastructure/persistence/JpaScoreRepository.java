package com.tournament.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface JpaScoreRepository extends JpaRepository<ScoreEntity, UUID> {
    Optional<ScoreEntity> findByMatchId(UUID matchId);
}