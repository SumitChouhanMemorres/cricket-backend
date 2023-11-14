package com.cricket.api.CricketBackend.repositories;

import com.cricket.api.CricketBackend.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    Optional<Match> findByTeamHeading(String teamHeading);
}
