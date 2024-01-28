package org.example.rickandmorti.domain;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Класс, представляющий информацию о персонаже.
 */
@Data
@Getter
@Setter
public class Result {
    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private String image;
    private String url;
    private Date created;
}