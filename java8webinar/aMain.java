package java8webinar;

import java8webinar.model.User;
import java8webinar.service.UserService;
import java8webinar.util.Validator;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class aMain {
    public static void main(String[] args) {
        UserService service = UserService.getInstance();
        Validator adultValidator = user -> Validator.isAdult(user.getBirthDay());
        //
        Validator youngValidator = user -> !Validator.isAdult(user.getBirthDay());

        //service.getUserByID(2).ifPresentOrElse(System.out::println,() -> System.out.println("Пользователь не найден"));
        //System.out.println(service.getValidUsers(adultValidator));
        //System.out.println(service.getValidUsers(youngValidator));
        //System.out.println(service.getSortedUsers((u1,u2)-> Period.between(u1.getBirthDay(),u2.getBirthDay()).isNegative()?-1:1));
        //System.out.println(service.getReducedUser((u1,u2)-> Period.between(u1.getBirthDay(),u2.getBirthDay()).isNegative()?u2:u1));
        System.out.println(service.getSortedUsers(Comparator.comparing(User::getBirthDay)));
    }
}
