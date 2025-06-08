package com.tournament.application.repository;


import com.tournament.domain.model.Score;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ScoreRepository {
    void save(Score score);
    Optional<Score> findByMatchId(UUID matchId);
    List<Score> findAll();

}
