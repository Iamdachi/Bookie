package com.github.Iamdachi.bookie.web;

import com.github.Iamdachi.bookie.entity.Country;
import com.github.Iamdachi.bookie.service.ICountryService;
import com.github.Iamdachi.bookie.utils.BookieValidationUtils;
import jakarta.persistence.EntityNotFoundException;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/country")
public class CountryController {

    private final ICountryService countryService;
    private final BookieValidationUtils bookieValidationUtils;

    public CountryController(ICountryService countryService, BookieValidationUtils bookieValidationUtils) {
        this.countryService = countryService;
        this.bookieValidationUtils = bookieValidationUtils;
    }

    @GetMapping
    public ResponseEntity<List<Country>> findAll() {
        return ResponseEntity.ok(countryService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> findById(@PathVariable Long id) {
        return ResponseEntity.ok(countryService.findById(id).orElseThrow( () -> new EntityNotFoundException("Country not found!") ));
    }

    @PostMapping
    public ResponseEntity<Country> save(@RequestBody Country country) {
        bookieValidationUtils.validateCountry(country);
        return ResponseEntity.ok(countryService.save(country));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        countryService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}")
    public ResponseEntity<Country> update(@RequestBody Country country, @PathVariable Long id) {
        return ResponseEntity.ok(countryService.update(id, country));
    }

}
