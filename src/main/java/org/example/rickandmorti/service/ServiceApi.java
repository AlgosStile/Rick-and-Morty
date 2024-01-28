package org.example.rickandmorti.service;

import org.example.rickandmorti.domain.Characters;

/**
 * Интерфейс для получения информации о персонажах.
 */
public interface ServiceApi {
    /**
     * Получает список персонажей из внешнего API.
     * @return объект Characters с информацией о персонажах
     */
    Characters getAllCharactersFromApi();
}

