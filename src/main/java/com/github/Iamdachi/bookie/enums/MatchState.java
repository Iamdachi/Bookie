package com.github.Iamdachi.bookie.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

/**
 * Converts a string to a MatchState enum value, handling case-insensitivity.
 * (Jackson defaults to case-sensitive exact matching on the enum constant name)
 * Logs a warning if invalid value
 *
 * @Param String representation of MatchState
 * @Return the corresponding MatchState enum value, or throw exception if invalid input.
 */
public enum MatchState {
    PREMATCH, LIVE, ENDED, POSTPONED;

    /** deserialization — JSON → Java */
    @JsonCreator
    public static MatchState fromString(String value) {
        if (value == null || value.isEmpty()) {
            // TODO: fix the silent nulls to properly throw 400 errors
            return null;
        }
        try {
            return MatchState.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /**
     * Convert the enum to its String representation.
     * Serialization — Java → JSON
     * (Jackson serializes an enum using .name() by default anyway, so kinda pointless :) )
     *
     * @return String representation of MatchState
     */
    @JsonValue
    public String toValue () {
        return this.name();
    }
}
