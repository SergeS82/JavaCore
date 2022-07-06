package DateTimeAPI.new_api;

import java.time.*;

public class YPeriodDuration {
    public static void main(String[] args) {
        //Period
        LocalDate ld = LocalDate.now(); // immutable
        ld = ld.plus(Period.of(1,1,1));
        ld = ld.minus(Period.ofYears(1));
        ld = ld.minus(Period.ofMonths(1));
        ld = ld.plus(Period.ofDays(1));
        ld = ld.plus(Period.ofWeeks(1));
        //Duration
        LocalTime lt = LocalTime.now();
        lt = lt.minus(Duration.ofHours(1));
        lt = lt.minus(Duration.ofMinutes(1));
        lt = lt.minus(Duration.ofSeconds(1));
        lt = lt.minus(Duration.ofMillis(1));
        lt = lt.minus(Duration.ofNanos(1));
        lt = lt.minus(Duration.ofDays(1));
        //
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.minus(Duration.ofDays(1)));
    }
}
