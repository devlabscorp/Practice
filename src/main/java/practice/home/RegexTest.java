package practice.home;

import java.util.Scanner;

public class RegexTest {

    public static void main(String[] args) {

        String test = "\"AAA,A\",\"BBB\",\"CC" +
                "CC\"";

        Scanner scanner = new Scanner(test).useDelimiter("\",\"");

        while (scanner.hasNextLine()) {
            System.out.println(scanner.next());
        }


    }
}
