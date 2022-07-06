package DateTimeAPI.new_api;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class YInstant {
    public static void main(String[] args) {
        Date date  = new Date();
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Europe/Moscow"));
        System.out.println(zonedDateTime);
    }
}
