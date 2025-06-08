package com.tournament.presentation.controller;



import com.tournament.application.usecase.GetScoreUseCase;
import com.tournament.application.usecase.UpdateScoreUseCase;
import com.tournament.domain.model.Score;
import com.tournament.presentation.dto.ScoreRequest;
import com.tournament.presentation.dto.ScoreResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/scores")
public class ScoreController {

    private final UpdateScoreUseCase updateScoreUseCase;
    private final GetScoreUseCase getScoreUseCase;

    public ScoreController(UpdateScoreUseCase updateScoreUseCase, GetScoreUseCase getScoreUseCase) {
        this.updateScoreUseCase = updateScoreUseCase;
        this.getScoreUseCase = getScoreUseCase;
    }


    @PostMapping
    public ResponseEntity<Void> submitScore(@RequestBody ScoreRequest request) throws Exception {
        updateScoreUseCase.updateScore(
                request.getMatchId(),
                request.getPlayer1Score(),
                request.getPlayer2Score()
        );
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<List<ScoreResponse>> getAllScores() {
        List<Score> scores = getScoreUseCase.getAllScores();

        List<ScoreResponse> response = scores.stream()
                .map(score -> new ScoreResponse(
                        score.getMatchId(),
                        score.getPlayer1Score(),
                        score.getPlayer2Score(),
                        score.getSubmittedAt()
                ))
                .toList();

        return ResponseEntity.ok(response);
    }



    @GetMapping("/{matchId}")
    public ResponseEntity<ScoreResponse> getScore(@PathVariable UUID matchId) throws Exception {
        Score score = getScoreUseCase.getScoreByMatchId(matchId);
        ScoreResponse response = new ScoreResponse(
                score.getMatchId(),
                score.getPlayer1Score(),
                score.getPlayer2Score(),
                score.getSubmittedAt()
        );
        return ResponseEntity.ok(response);
    }
}