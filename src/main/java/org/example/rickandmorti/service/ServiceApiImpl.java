package org.example.rickandmorti.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.rickandmorti.domain.Characters;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Реализация интерфейса ServiceApi для получения информации о персонажах из внешнего API.
 */
@Service
public class ServiceApiImpl implements ServiceApi {

    @Value("${api.characters.url}")
    private String apiCharactersUrl;

    private final RestTemplate restTemplate;
    /**
     * Конструктор с параметром restTemplate.
     *
     * @param restTemplate объект RestTemplate для выполнения HTTP-запросов
     */
    public ServiceApiImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    /**
     * Получает список персонажей из внешнего API.
     *
     * @return объект Characters с информацией о персонажах
     */
    @Override
    public Characters getAllCharactersFromApi() {
        ResponseEntity<Characters> response = restTemplate.exchange(
                apiCharactersUrl,
                HttpMethod.GET,
                null,
                Characters.class
        );
        return response.getBody();
    }
}
