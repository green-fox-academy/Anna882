package comperable;
import printable.Printable;
import java.util.Arrays;

public class Domino implements Comparable<Domino>, Printable{
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }


  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }
  public int compareTo(Domino currentItem) {
    if (values[0] > currentItem.values[0]) {
      return 1;
    } else return -1;
  }

  @Override
  public void printAllFields() {
    System.out.println(values[0] + " " + values[1]);

  }
}