package optional;

import java.util.Optional;

public class Exercise1441 {
    public static void main(String[] args) {
        String text = "Hello";
        Optional<String> opt = Optional.of(refactorText(text)); // строка 1 NullPointerException
        Optional<String> opt2 = Optional.ofNullable(refactorText(text));
        Optional.ofNullable(refactorText(text)).ifPresent(System.out::println);
        System.out.println(opt2.isPresent());
    }

    private static String refactorText(String text) {
        if (text.length() >= 5) {
            return null;
        } else {
            return text + " refactored";
        }
    }
}
