package com.github.Iamdachi.bookie.model.dto;

import com.github.Iamdachi.bookie.enums.OddStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OddDTO {
    // Todo: add swagger.v3 schemas

    private OddStatus status;
    private Double value;
    private Long match;
    private Long MarketId;

    public OddDTO(OddStatus status, Double value) {
        this.status = status;
        this.value = value;
    }
}
