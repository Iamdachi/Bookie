package com.github.Iamdachi.bookie.service.impl;

import com.github.Iamdachi.bookie.entity.Country;
import com.github.Iamdachi.bookie.repository.CountryRepository;
import com.github.Iamdachi.bookie.service.ICountryService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService implements ICountryService {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country update(Long id, Country country) {
        Country updatedCountry = countryRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Country not found!"));
        updatedCountry.setName(country.getName());
        updatedCountry.setSportId(country.getSportId());
        return countryRepository.save(updatedCountry);
    }

    @Override
    public void delete(Long country) {
        Country deletedCountry = countryRepository.findById(country).orElseThrow(() -> new EntityNotFoundException("Country not found!"));
        countryRepository.delete(deletedCountry);
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return Optional.ofNullable(countryRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Country not found!")));
    }
}
