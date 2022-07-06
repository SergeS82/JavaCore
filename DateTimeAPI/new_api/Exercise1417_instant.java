package DateTimeAPI.new_api;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Exercise1417_instant {
    public static LocalTime ltInstant(Date dt){
        return LocalTime.from(dt.toInstant().atZone(ZoneId.of("Europe/Moscow")));
    }
    public static void main(String[] args) {
        System.out.println(ltInstant(new Date()));
    }
}
