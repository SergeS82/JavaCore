package java8webinar.util;

import java8webinar.model.User;

import java.time.LocalDate;
import java.time.Period;

@FunctionalInterface
public interface Validator {
    boolean validate(User user);
    static boolean isAdult(LocalDate birthDay){
        return Period.between(birthDay, LocalDate.now()).getYears()>=18;
    }
}
