import java.util.ArrayList;
import java.util.List;

public class Apple {

  public String getApple() {
    return "apple";
  }

  public Integer sum(List<Integer> exampleList) {
    Integer result = 0;
    for (Integer number:exampleList) {
      result += number;
    }
    return result;
  }
}
