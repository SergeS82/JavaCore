package lambda;

import java.sql.Struct;
import java.util.function.BiPredicate;

public class Exercise1425 {
    public static void main(String[] args) {
        BiPredicate<String, String> param = (str1, str2) -> str1.endsWith(str2);
        param = param.and((str1, str2) -> (str1).startsWith(str2));
        param = param.and(String::endsWith);
        task("qqqq","qq", param);
    }
    private static void task(String val1, String val2 ,BiPredicate<String, String> param) {
        System.out.println(param.test(val1, val2));
    } // вставьте тип
}
