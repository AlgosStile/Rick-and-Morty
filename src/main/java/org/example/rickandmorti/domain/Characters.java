package org.example.rickandmorti.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Класс представляющий список персонажей.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Characters {
    @JsonIgnore
    private ProcessHandle.Info info;
    private List<org.example.rickandmorti.domain.Result> results;
}
