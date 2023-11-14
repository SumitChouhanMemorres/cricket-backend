package com.cricket.api.CricketBackend.controllers;

import com.cricket.api.CricketBackend.entities.Match;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cricket.api.CricketBackend.services.MatchService;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {
    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    @GetMapping

    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }

    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
    }
}
