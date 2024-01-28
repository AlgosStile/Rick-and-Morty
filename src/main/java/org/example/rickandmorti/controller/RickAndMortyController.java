package org.example.rickandmorti.controller;

import org.example.rickandmorti.domain.Characters;
import org.example.rickandmorti.domain.Result;
import org.example.rickandmorti.service.ServiceApi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Контроллер для отображения списка персонажей и информации о персонаже.
 */
@Controller
public class RickAndMortyController {

    private final ServiceApi serviceApi;

    public RickAndMortyController(ServiceApi serviceApi) {
        this.serviceApi = serviceApi;
    }
    /**
     * Отображает страницу со списком персонажей.
     * @param model объект модели
     * @return имя представления "characterList"
     */
    @GetMapping("/characters")
    public String showCharacterList(Model model) {
        Characters characters = serviceApi.getAllCharactersFromApi();
        model.addAttribute("characters", characters.getResults());
        return "characterList";
    }
    /**
     * Отображает информацию о выбранном персонаже.
     * @param id идентификатор персонажа
     * @param model объект модели
     * @return имя представления "character"
     */
    @GetMapping("/character/{id}")
    public String showCharacter(@PathVariable Integer id, Model model) {
        Characters characters = serviceApi.getAllCharactersFromApi();
        Result character = characters.getResults().stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
        model.addAttribute("character", character);
        return "character";
    }
}
