import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise5to6 {

  public static void main(String[] args) {

    String sentense = "Write a Stream Expression to find the uppercase characters in a string!";

    sentense.chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> Character.toString((char) c))
            .forEach(System.out::println);

//    Write a Stream Expression to find the strings which starts with A and ends with I in the following array:

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
            "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    List<String> startsWithAAndEndsWithI = cities
            .stream()
            .filter(w -> w.startsWith("A") && w.endsWith("I"))
            .collect(Collectors.toList());

    System.out.println(startsWithAAndEndsWithI);

    Map<Character, Long> charFrequency =
    "Write a Stream Expression to find the frequency of characters in a given string".chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    System.out.println(charFrequency);

  }
}
