package practice.home;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;
import static org.junit.Assert.*;

public class StreamsAPIExTest {


    @Test
    public void testStreams() {
        String x = "a";
        Optional<String> s = Optional.of("test");
        assertEquals(Optional.of("TEST"), s.map(String::toUpperCase));

        Optional<String> s1 = s.map(String::toUpperCase);
        Optional.ofNullable(x).map(String::toUpperCase);

        Optional<String> opt = Optional.ofNullable(null);
        opt.ifPresent(name -> System.out.println(name.length()));

        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("john");
        assertEquals("john", name);

        name = Optional.ofNullable(nullName).orElseGet(() -> "john");
        assertEquals("john", name);

        List<String> list = Arrays.asList("aa", "bb", "c", "d", "e,");
        System.out.println(list.stream().collect(toMap(Function.identity(), String::length)));

        list = Arrays.asList("aa", "bb", "c", "d", "e,", "aa", "ab", "aa");
        System.out.println(list.stream().collect(toMap(Function.identity(), String::length, (first, next) -> first)));


    }

}