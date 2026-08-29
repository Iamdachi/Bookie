package com.github.Iamdachi.bookie.repository;

import com.github.Iamdachi.bookie.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    boolean existsByNameAndSportId(String name, Long sportId);
}
