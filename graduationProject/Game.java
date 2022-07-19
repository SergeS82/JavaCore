package graduationProject;

import graduationProject.area.*;
import graduationProject.persons.Human;
import graduationProject.area.Shop;
import graduationProject.persons.Person;

import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static final Random random = new Random();
    public static final Person hero = new Human("S", 10, 10, 0, 1000, 2);
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        Optional<Action> action;
        boolean exit = false;
        while (!exit) {
            action = Optional.empty();
            switch (getAction()) {
                case 1 -> action = Optional.of(new Shop(hero));
                case 2 -> {
                    try {
                        action = Optional.of(new Forest(hero));
                    } catch (Forest.CantFightException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> exit = true;
            }
            if (action.isPresent()) {
                do {
                    Thread thr = new Thread(action.get());
                    thr.start();
                    thr.join();
                } while (continueAction(action.get().getActionName()));
            }
        }
    }
    // выбор действия
    public static int getAction() {
        int result;
        do {
            System.out.println("1. К торговцу");
            System.out.println("2. В темный лес");
            System.out.println("3. На выход");
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            result = scanner.nextInt();
        } while (!(result >= 1 && result <= 3));
        return result;
    }

    //продолжить / вернуться в главное меню
    static boolean continueAction(String action) {
        String command;
        do {
            System.out.printf("вернуться в город - [R], продолжить %s - [C] : ", action);
            command = scanner.next();
        } while (!"RrCc".contains(command));
        return "Cc".contains(command);
    }

}
