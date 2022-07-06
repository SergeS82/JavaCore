package optional;

import java.util.Optional;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise1445 {
    public static Optional<String> guess(int guess) {
        if (guess >=1 && guess <=5){
            Random rd = new Random();
            if (rd.nextInt(5)+1 == guess) return Optional.of("Поздравляем! Вы угадали значение!");
            else return Optional.empty();
        } else throw new IllegalStateException();
    }

    public static void main(String[] args) {
        int cnt = 0;
        for (int i =0; i<100;i++)
          if (guess(3).isPresent()) cnt++;
        System.out.println("Угадали "+cnt+" раз.");
    }
}
