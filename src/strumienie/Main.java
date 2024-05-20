package strumienie;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        String imiona = Stream.of("Jakub", "Kamil", "Magdalena", "Jan")
                .collect(Collectors.joining(", ")); //służy do łączenia elementów typu Stream<String>

        System.out.println(imiona);
    }
}
