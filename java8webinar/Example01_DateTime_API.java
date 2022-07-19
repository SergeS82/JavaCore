package java8webinar;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;

public class Example01_DateTime_API {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(availableZoneId);
        }
        ZonedDateTime nextFriday = LocalDateTime.now().plusHours(1).with(TemporalAdjusters.next(DayOfWeek.FRIDAY)).atZone(ZoneId.of("Europe/Moscow"));
        System.out.println(nextFriday);
    }
}
