package java8webinar.service;

import java8webinar.model.User;
import java8webinar.util.Validator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserService {
    private static UserService userService;
    private List<User> data = new ArrayList<>();
    {
        data.add(new User("Иван", "Иванов", LocalDate.now().minusYears(20)));
        data.add(new User("Сидр", "Сидоров", LocalDate.now().minusYears(10)));
        data.add(new User("Петр", "Петров", LocalDate.now().minusYears(20).minusDays(1)));
        data.add(new User("Дмитрий", "Дмитриев", LocalDate.now().minusYears(12)));
        data.add(new User("Юрий", "Юриев", LocalDate.now().minusYears(21)));
    }
    public static UserService getInstance(){
        if(userService==null) userService = new UserService();
        return userService;
    }

    private UserService() {
    }

    public List<User> getData() {
        return data;
    }

    public List<User> getValidUsers(Validator validator){
        //Stream.of(data)
        return data.stream()
                .filter(validator::validate)
                .collect(Collectors.toList())
//                .collect(ArrayList::new, ArrayList::add,ArrayList::addAll)
        ;
//        List<User> validUsers = new ArrayList<>();
//        for (User user : data) {
//            if (validator.validate(user)) {
//                validUsers.add(user);
//            }
//        }
//        return validUsers;
    }

    public Optional<User> getUserByID(int id){
        if (id<data.size()) return Optional.of(data.get(id));
        else return Optional.empty();
    }
    public List<User> getSortedUsers(Comparator<User> comparator){
         return data.stream().sorted(comparator).collect(Collectors.toList());
    }

    public Optional<User> getReducedUser(BinaryOperator<User> binaryOperator){
        return data.stream()
                .reduce(binaryOperator);
    }
}
