package com.tournament.config;


import com.tournament.application.repository.ScoreRepository;
import com.tournament.application.usecase.CreateScoreService;
import com.tournament.application.usecase.CreateScoreUseCase;
import com.tournament.application.usecase.GetScoreService;
import com.tournament.application.usecase.GetScoreUseCase;
import com.tournament.application.usecase.UpdateScoreService;
import com.tournament.application.usecase.UpdateScoreUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScoreUseCaseConfig {

    @Bean
    public CreateScoreUseCase createScoreUseCase(ScoreRepository scoreRepository) {
        return new CreateScoreService(scoreRepository);
    }

    @Bean
    public UpdateScoreUseCase updateScoreUseCase(ScoreRepository scoreRepository) {
        return new UpdateScoreService(scoreRepository);
    }

    @Bean
    public GetScoreUseCase getScoreUseCase(ScoreRepository scoreRepository) {
        return new GetScoreService(scoreRepository);
    }

}