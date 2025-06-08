package com.tournament.infrastructure.persistence;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "scores", uniqueConstraints = @UniqueConstraint(columnNames = "matchId"))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScoreEntity {

    @Id
    private UUID id;

    @Column(nullable = false, unique = true)
    private UUID matchId;

    private int player1Score;
    private int player2Score;
    private LocalDateTime submittedAt;
}