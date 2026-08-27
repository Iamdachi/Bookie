package com.github.Iamdachi.bookie.entity;

import com.github.Iamdachi.bookie.enums.MatchState;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "matches")
@Getter
@Setter
public class Match extends BaseEntity {

    @Column(nullable = false)
    private boolean enabled;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MatchState state;

    @Column(nullable = false)
    private Date startDate;

    private String score;

    @Column(name = "created_by", nullable = false)
    private Long createdBy;

    @Column(name = "sport_id")
    private Long sportId;

    private Long countryId;

    private Long leagueId;

    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL)
    private List<Odd> odds;


    public Match() { }

    public Match(boolean enabled, MatchState state, Date startDate, String Score, Long createdBy, Long sportId, Long countryId, Long leagueId, List<Odd> odds) {
        this.enabled = enabled;
        this.state = state;
        this.startDate = startDate;
        this.score = score;
        this.createdBy = createdBy;
        this.sportId = sportId;
        this.countryId = countryId;
        this.odds = odds;
        this.leagueId = leagueId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Match match = (Match) o;
        return enabled == match.enabled
                && state == match.state
                && Objects.equals(startDate, match.startDate)
                && Objects.equals(score, match.score)
                && Objects.equals(createdBy, match.createdBy)
                && Objects.equals(sportId, match.sportId)
                && Objects.equals(countryId, match.countryId)
                && Objects.equals(leagueId, match.leagueId)
                && Objects.equals(odds, match.odds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), enabled, state, startDate, score, createdBy, sportId, countryId, leagueId, odds);
    }
}
