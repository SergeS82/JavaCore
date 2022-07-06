[zMethods.txt]  - методы работы

Пакет java.time:
! immutable
-   LocalDate	Объект данного типа содержит только дату.
    Хороший пример инициализации: ваш день рождения. Эта дата не изменяется от года к году.
-   LocalTime	Объект данного типа содержит только время.
    Например: полночь/полдень.
-   LocalDateTime	Объект данного типа содержит как дату, так и время.
    Пример: дата и время Нового Года.
-   ZonedDateTime	Объект данного типа содержит дату, время и часовой пояс.
    Пример:запланированная встреча 9 июля 2022 года в 14:55, время Московское.
Инициализация переменной текущим значением дата/время:
-   LocalDate.now()	2022-06-30
-   LocalTime.now()	19:15:30
-   LocalDateTime.now()	2022-06-30T19:15:30
-   ZonedDateTime.now()	2022-06-30T19:15:30+01:00 Europe/Paris

Конструкторы:
-   public static LocalDate of(int year, int month, int dayOfMonth)
    LocalDate.of(2013, 2, 22)
-   public static LocalDate of(int year, Month month, int dayOfMonth)
    LocalDate.of(2013, Month.February, 22)
-   public static LocalTime of(int hour, int minute)
    LocalTime.of(6, 15)
-   public static LocalTime of(int hour, int minute, int second)
    LocalTime.of(6, 15, 54)
-   public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
    LocalDateTime.of(2013, 2, 22, 6, 15)
-   public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
    LocalDateTime.of(2013, 2, 22, 6, 15, 54)
-   public static ZonedDateTime of(LocalDate date, LocalTime time, ZoneId zone
    ZonedDateTime.of(LocalDate.of(2013, 2, 22), LocalTime.of(6, 15), ZoneId.of("US/Eastern"))
-   public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zone)
    ZonedDateTime.of(LocalDateTime.of(2013, 2, 22, 6, 15), ZoneId.of("US/Eastern"))
Временные зоны:
-   ZoneId.systemDefault()  - текущая зона
-   ZoneId.of("US/Eastern") - конкретная зона
-   ZoneId.getAvailableZoneIds() - все доступные временные зоны