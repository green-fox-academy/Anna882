import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {

  public static void main(String[] args) {

    ArrayList<Fox> aList = new ArrayList<>();
    Fox fox1 = new Fox("Vuk", "pallida", "green");
    Fox fox2 = new Fox("Roka", "macrotis", "green");
    Fox fox3 = new Fox("Foxi", "macrotis", "yellow");
    Fox fox4 = new Fox("Cool", "pallida", "yellow");
    Fox fox5 = new Fox("LittleFox", "pallida", "green");

    aList.add(fox1);
    aList.add(fox2);
    aList.add(fox3);
    aList.add(fox4);
    aList.add(fox5);

    List<Fox> greenFoxes =
    aList.stream()
            .filter(f -> f.color.equals("green"))
            .collect(Collectors.toList());

    System.out.println(greenFoxes);

    aList.stream()
            .filter(f -> f.type.equals("pallida") && f.color.equals("green"))
            .collect(Collectors.toList())
            .forEach(System.out::println);

  }
}
// name/create them! Write a Stream Expression to find the foxes with green color! Write a Stream Expression to find
// the foxes with green color and pallida type!

