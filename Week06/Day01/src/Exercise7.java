import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise7 {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
//    Write a Stream Expression to find the frequency of numbers in the following array:
    System.out.println( numbers.stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting())));
//    "Write a Stream Expression to convert a char array to a string!";
    Character[] kutya = {'k', 'u', 't', 'y', 'a'};

    String doggy =  Arrays.stream(kutya)
            .map(Object::toString)
            .collect(Collectors.joining() );
    System.out.println(doggy);
  }
}
