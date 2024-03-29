# Проектирование и реализация серверного приложения с внешним API

## Rick and Morty Characters App

Это приложение отображает список персонажей из мультсериала "Rick and Morty" и предоставляет возможность посмотреть 
подробную информацию о каждом персонаже.

## Условие 
### Разработать сайт:
- Отображающий список героев мультсериала Rick and Morty (с картинками)
- При выборе героя отобразить карточку товара с персонажем (с картинкой)
- В проекте использовать шаблонизатор thymeleaf

## Установка
1. Установите зависимости (см. pom.xml):
   - spring-boot-starter-data-jpa
   - spring-boot-starter-thymeleaf
   - spring-boot-starter-web
   - h2
   - lombok
2. Склонируйте текущий репозиторий
3. Перейдите в каталог проекта:
   bash
   cd rickandmorty-app
4. Соберите приложение с помощью Maven:
   bash
   mvn clean install
5. Перейдите по следующему URL для просмотра списка героев:
    http://localhost:8080/characters

## Использование

* При переходе по URL http://localhost:8080/characters будет отображен список персонажей.
* При клике на персонажа из списка, вы попадете на страницу с подробной информацией о выбранном персонаже.



