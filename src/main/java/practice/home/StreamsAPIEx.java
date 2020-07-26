package practice.home;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsAPIEx {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream()
                .filter(e -> e.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        Predicate<Integer> evens = (n) -> 0 == n % 2;
        Predicate<Integer> odds = (n) -> 0 != n % 2;
        Stream.of(1, 2, 3, 4, 5).filter(evens).forEach(System.out::println);
        Stream.of(1, 2, 3, 4, 5).filter(odds).forEach(System.out::println);

        String text = "Item1 10 Item2 25 Item3 30 Item4 45";

        System.out.println(Stream.of(text.split("\\s+")).filter(s -> s.matches("\\d+")).mapToInt(Integer::valueOf).sum());


        Function<String, String> func = (message) -> message + " from lambda";

    }
}
