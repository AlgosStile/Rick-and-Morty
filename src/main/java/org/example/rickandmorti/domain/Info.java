package org.example.rickandmorti.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Информация о списке персонажей.
 */
@Data
@Getter
@Setter
public class Info {
    private Integer count;
    private Integer pages;
    private String next;
    private String prev;
}