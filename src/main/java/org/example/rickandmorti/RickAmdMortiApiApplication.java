package org.example.rickandmorti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Основной класс Spring Boot приложения.
 */
@SpringBootApplication
@EnableWebMvc
public class RickAmdMortiApiApplication {
    /**
     * Создает и возвращает экземпляр RestTemplate для выполнения HTTP-запросов.
     *
     * @return объект RestTemplate
     */
    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }

    /**
     * Создает и возвращает объект HttpHeaders для установки заголовков HTTP-запросов.
     *
     * @return объект HttpHeaders
     */
    @Bean
    public HttpHeaders headers() {
        return new HttpHeaders();
    }
    /**
     * Точка входа в приложение.
     */
    public static void main(String[] args) {
        SpringApplication.run(RickAmdMortiApiApplication.class, args);
    }

}
