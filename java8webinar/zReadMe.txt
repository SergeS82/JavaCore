-   DateTime API (LocalDate, LocalTime, LocalDateTime, Zoned...)
    1.  Date и Calendar - mutable
        DateTine API - immutable?
        Пример ZonedDateTime nextFriday = LocalDateTime.now().plusHours(1).with(TemporalAdjusters.next(DayOfWeek.FRIDAY)).atZone(ZoneId.of("PST"));
    2. java.time - один пакет для всех классов
-   Функциональные интерфейсы
-   default- и static- методы в интерфейсах
-   Лямбда-функции
-   Optionals                               - предотвращение NullPointerException
-   Встроенные функциональные интерфейсы
-   Steam API                               - работа с масиивами данных в функциональном стиле
