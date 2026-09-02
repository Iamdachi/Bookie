package com.github.Iamdachi.bookie.web;

import com.github.Iamdachi.bookie.entity.League;
import com.github.Iamdachi.bookie.service.ILeagueService;
import com.github.Iamdachi.bookie.utils.BookieValidationUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LeagueController {
    private final ILeagueService leagueService;
    private final BookieValidationUtils bookieValidationUtils;

    public LeagueController(ILeagueService leagueService, BookieValidationUtils bookieValidationUtils) {
        this.leagueService = leagueService;
        this.bookieValidationUtils = bookieValidationUtils;
    }

    @GetMapping
    public ResponseEntity<List<League>> findAll() {
        return ResponseEntity.ok(leagueService.findAll());
    }

    @GetMapping("{/id}")
    public ResponseEntity<League> findById(@PathVariable Long id) {
        return ResponseEntity.ok(leagueService.findById(id).orElseThrow());
    }

    @PostMapping
    public ResponseEntity<League> save(@RequestBody League league) throws Exception {
        bookieValidationUtils.validateLeague(league);
        return ResponseEntity.ok(leagueService.save(league));
    }

    @PutMapping("/{id}")
    public ResponseEntity<League> update(@RequestBody League league, @PathVariable Long id) {
        return ResponseEntity.ok(leagueService.update(league, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        leagueService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
