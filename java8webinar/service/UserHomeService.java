package java8webinar.service;

import java8webinar.model.Home;
import java8webinar.model.User;

import java.util.Map;
import java.util.TreeMap;

public class UserHomeService {
    public Map<User, Home> data = new TreeMap<>();
    {
        UserService userService = UserService.getInstance();
        for (User user : userService.getData()) {
            data.put(user,new Home(user.getName()+" street"));
        }
    }
}
