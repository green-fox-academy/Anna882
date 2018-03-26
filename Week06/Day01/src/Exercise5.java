
public class Exercise5 {

  public static void main(String[] args) {

    String sentense = "Write a Stream Expression to find the uppercase characters in a string!";

    sentense.chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> Character.toString((char) c))
            .forEach(System.out::print);

  }
}
