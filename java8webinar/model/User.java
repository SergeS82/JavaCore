package java8webinar.model;

import java.time.LocalDate;

public class User {
    private static long totalUsers = 1;
    private long id;
    private String name;
    private String surName;
    private LocalDate birthDay;

    public User(String name, String surName, LocalDate birthDay) {
        id = totalUsers++;
        this.name = name;
        this.surName = surName;
        this.birthDay = birthDay;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", birthDay=" + birthDay +
                '}'+"\n";
    }
}
