-   DateTime API (LocalDate, LocalTime, LocalDateTime, Zoned...)
    1.  Date � Calendar - mutable
        DateTine API - immutable?
        ������ ZonedDateTime nextFriday = LocalDateTime.now().plusHours(1).with(TemporalAdjusters.next(DayOfWeek.FRIDAY)).atZone(ZoneId.of("PST"));
    2. java.time - ���� ����� ��� ���� �������
-   �������������� ����������
-   default- � static- ������ � �����������
-   ������-�������
-   Optionals                               - �������������� NullPointerException
-   ���������� �������������� ����������
-   Steam API                               - ������ � ��������� ������ � �������������� �����
