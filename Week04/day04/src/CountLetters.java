import java.util.HashMap;

public class CountLetters {

  public HashMap <Character, Integer>  letterCounter(String string) {
    char[] letters = string.toCharArray();
    HashMap dictionary = new HashMap();
    for (char letter : letters) {
      if (dictionary.containsKey(letter)) {
        dictionary.put(letter, (int)dictionary.get(letter) + 1);
      } else {
        dictionary.put(letter, 1);
      }
    }
    return dictionary;
  }
}
