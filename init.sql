CREATE TABLE scores (
                        id UUID PRIMARY KEY,
                        match_id UUID UNIQUE NOT NULL,
                        player1_score INT,
                        player2_score INT,
                        submitted_at TIMESTAMP
);
