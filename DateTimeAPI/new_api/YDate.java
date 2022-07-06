package DateTimeAPI.new_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class YDate {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1982,01,19);
        System.out.println(birthday);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalDateTime ldt = LocalDateTime.of(birthday,lt);
        System.out.println(ldt);
        Set<String> zoneids = new TreeSet(((Comparator) (o1, o2) -> ((String) o1).compareTo((String) o2)).reversed());
        zoneids.addAll(ZoneId.getAvailableZoneIds());
        for (String name : zoneids){
            System.out.println(name);
        }
    }
}
