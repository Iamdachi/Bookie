package com.github.Iamdachi.bookie.service;

import com.github.Iamdachi.bookie.entity.Country;

import java.util.List;
import java.util.Optional;

public interface ICountryService {
    Country save (Country country);
    Country update(Long id, Country country);
    void delete(Long country);
    List<Country> findAll();
    Optional<Country> findById(Long id);
}
