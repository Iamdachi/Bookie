package com.github.Iamdachi.bookie.repository;

import com.github.Iamdachi.bookie.entity.Odd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OddRepository extends JpaRepository<Odd, Long> {

    @Query("SELECT o.id FROM Odd o WHERE o.id IN :ids")
    List<Long> findExistingIds(List<Long> ids);
}
