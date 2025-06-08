package com.tournament.application.usecase;


import com.tournament.domain.model.Score;

import java.util.List;
import java.util.UUID;

public interface GetScoreUseCase {
    Score getScoreByMatchId(UUID matchId) throws Exception;
    List<Score> getAllScores();
}