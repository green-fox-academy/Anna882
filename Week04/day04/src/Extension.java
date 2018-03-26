import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  public int add(int a, int b) {
    return 5;
  }

  public int maxOfThree(int a, int b, int c) {
    if (a > b && a > c)
      return a;
    else if (b > a && b > c)
      return b;
    else
      return c;
  }

  public double median(List<Integer> pool) {
    for (int i = 0; i < pool.size() - 1; i++) {
      if (pool.get(i) > pool.get(i + 1)) {
        Collections.swap(pool, i, i + 1);
      }
    }
    if (pool.size() % 2 == 0) {
      return (double) (((pool.get(pool.size() / 2)) + (pool.get(pool.size() / 2 - 1))) / 2);
    } else {
      return pool.get(pool.size() / 2);
    }
  }

  public boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  public String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
      }
    }
    return teve;
  }
}