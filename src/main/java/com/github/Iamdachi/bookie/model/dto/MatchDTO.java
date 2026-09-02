package com.github.Iamdachi.bookie.model.dto;

import com.github.Iamdachi.bookie.enums.MatchState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * DTO for Match Entity. This class is used to translate match data between layers.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MatchDTO {
    private String name;
    private boolean enabled;
    private MatchState state;
    private Date startDate;
    private String score;
    private Long createdBy;
    private Long sportId;
    private Long leagueId;
    private Long countryId;
    private List<MarketDto> marketsList;
}
