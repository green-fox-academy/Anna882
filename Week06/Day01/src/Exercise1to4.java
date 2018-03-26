import java.util.*;
import java.util.stream.Collectors;

public class Exercise1to4 {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> evenNumbers = numbers
            .stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

    System.out.println(evenNumbers);

    double averageValue = numbers
              .stream()
              .filter(n -> n % 2 == 1 || n % 2 == -1)
              .mapToInt(n -> n)
              .summaryStatistics()
              .getAverage();

    System.out.println("average = " + averageValue);

    List<Integer> squaredPositiveNumbers = numbers
            .stream()
            .filter(n -> n > 0)
            .map(n -> n * n)
            .collect(Collectors.toList());

    System.out.println(squaredPositiveNumbers);

    ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    numbers2.stream()
            .filter(n -> n * n > 20)
            .forEach(System.out::println);



  }
}
