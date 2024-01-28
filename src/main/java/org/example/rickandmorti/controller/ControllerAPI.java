package org.example.rickandmorti.controller;


import org.example.rickandmorti.domain.Characters;
import org.example.rickandmorti.service.ServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest-контроллер для обработки запроса на получение списка персонажей.
 */
@RestController
public class ControllerAPI {
    @Autowired
    private ServiceApi serviceApi;
    /**
     * Обрабатывает GET-запрос и возвращает список персонажей.
     * @return список персонажей в формате JSON
     */
    @GetMapping("/")
    public ResponseEntity<Characters> getCharacters() {
        Characters allCharacters = serviceApi.getAllCharactersFromApi();
        return new ResponseEntity<>(allCharacters, HttpStatus.OK);
    }
}

