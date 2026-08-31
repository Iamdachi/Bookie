package com.github.Iamdachi.bookie.utils;

import com.github.Iamdachi.bookie.entity.Country;
import com.github.Iamdachi.bookie.repository.CountryRepository;
import io.micrometer.common.util.StringUtils;
import jakarta.persistence.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
public class BookieValidationUtils {
    private final CountryRepository countryRepository;
    private static final Logger logger = LoggerFactory.getLogger(BookieValidationUtils.class);

    public BookieValidationUtils(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public void validateCountry(Country country) {
        if (StringUtils.isBlank(country.getName())) {
            throw new EntityNotFoundException("Name can not be empty.");
        }

        if (countryRepository.existsByNameAndSportId(country.getName(), country.getSportId())) {
            logger.warn("Country with name {0} and sport id {1} already exists", country.getName(), country.getSportId());
            throw new EntityNotFoundException(MessageFormat.format("Country with name {0} and sport id {1} already exists", country.getName(), country.getSportId()));
        }
    }
}
