package java8webinar;

import java.time.*;
import java.util.Date;

public class Example02 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(LocalDateTime.now().getMonth().minus(7));
        System.out.println(LocalDateTime.of(2022, 1, 19, 1, 1, 1));
        System.out.println(LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.of("UTC")));
        //Duration è Period
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = LocalDateTime.now().plusDays(20);
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.now().plusDays(20);
        System.out.println(Duration.between(start, end));
        System.out.println(Period.between(startDate, endDate));
    }
}
