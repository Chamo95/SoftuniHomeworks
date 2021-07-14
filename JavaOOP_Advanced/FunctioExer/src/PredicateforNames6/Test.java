package PredicateforNames6;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Integer digit = Integer.parseInt(scanner.nextLine());
            String [] text = scanner.nextLine().split("\\s");

        Predicate<String> isNameLengthLTE = w -> w.length()<=digit;
        for (String word : text) {
           if(isNameLengthLTE.test(word))
               System.out.println(word);
        }
        }

    }