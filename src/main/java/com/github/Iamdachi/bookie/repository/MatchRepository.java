package com.github.Iamdachi.bookie.repository;

import com.github.Iamdachi.bookie.entity.Match;
import com.github.Iamdachi.bookie.enums.MatchState;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.Optional;

public interface MatchRepository extends JpaRepository<Match, Long> {
    Optional<Match> findMatchById(Long id);

    boolean existsByNameAndSportIdAndStartDate(String name, Long sportId, Date startDate);

    @Query("SELECT m FROM Match m WHERE " +
            "(:sportId IS NULL OR m.sportId = :sportId) AND " +
            "(:countryId IS NULL OR m.countryId = :countryId) AND " +
            "(:leagueId IS NULL OR m.leagueId = :leagueId) AND " +
            "(:state IS NULL OR m.state = :state) AND " +
            "(:enabled IS NULL OR m.enabled = :enabled) AND " +
            "(:startOfDay IS NULL OR m.startDate >= :startDay) AND " +
            "(:endOfDay IS NULL OR m.startDate <= :endOfDay)")
    Page<Match> filterMatches(@Param("sportId") Long sportId,
                              @Param("countryId") Long countryId,
                              @Param("leagueId") Long leagueId,
                              @Param("enabled") Boolean enabled,
                              @Param("state") MatchState state,
                              @Param("startOfDay") Date startOfDay,
                              @Param("endOfDay") Date endOfDay,
                              Pageable pageable);
}
