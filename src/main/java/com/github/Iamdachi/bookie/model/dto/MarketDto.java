package com.github.Iamdachi.bookie.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MarketDto {
    private Long id;
    private String name;
    private List<OddDTO> odds;
}
