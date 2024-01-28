package org.example.rickandmorti.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
/**
 * Класс представляющий список персонажей.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Characters {
    @JsonIgnore
    private ProcessHandle.Info info;
    private List<org.example.rickandmorti.domain.Result> results;
}
