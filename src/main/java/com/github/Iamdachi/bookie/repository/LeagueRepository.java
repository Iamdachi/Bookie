package com.github.Iamdachi.bookie.repository;

import com.github.Iamdachi.bookie.entity.League;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<League, Long> {
    boolean existsByCountryAndSportIdAndName(Long countryId, Long sportId, @NotBlank(message = "Name cannot be blank") String name);
}
