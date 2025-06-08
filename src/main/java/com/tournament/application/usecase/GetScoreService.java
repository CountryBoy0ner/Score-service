package com.tournament.application.usecase;



import com.tournament.application.repository.ScoreRepository;
import com.tournament.domain.model.Score;

import java.util.List;
import java.util.UUID;

public class GetScoreService implements GetScoreUseCase {

    private final ScoreRepository scoreRepository;

    public GetScoreService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @Override
    public Score getScoreByMatchId(UUID matchId) throws Exception {
        return scoreRepository.findByMatchId(matchId)
                .orElseThrow(() -> new Exception("Score not found for matchId: " + matchId));
    }

    @Override
    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }
}