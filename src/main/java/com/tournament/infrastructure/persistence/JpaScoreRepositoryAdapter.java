package com.tournament.infrastructure.persistence;


import com.tournament.application.repository.ScoreRepository;
import com.tournament.domain.model.Score;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class JpaScoreRepositoryAdapter implements ScoreRepository {

    private final JpaScoreRepository jpaScoreRepository;

    public JpaScoreRepositoryAdapter(JpaScoreRepository jpaScoreRepository) {
        this.jpaScoreRepository = jpaScoreRepository;
    }

    @Override
    public void save(Score score) {
        jpaScoreRepository.save(ScoreEntityMapper.toEntity(score));
    }

    @Override
    public Optional<Score> findByMatchId(UUID matchId) {
        return jpaScoreRepository.findByMatchId(matchId)
                .map(ScoreEntityMapper::toDomain);
    }

    @Override
    public List<Score> findAll() {
        return jpaScoreRepository.findAll().stream()
                .map(ScoreEntityMapper::toDomain)
                .toList();
    }
}