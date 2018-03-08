public class Anagram {

  public boolean isAnagram(String word1, String word2) {
    char[] characters1 = word1.toLowerCase().toCharArray();
    char[] characters2 = word2.toLowerCase().toCharArray();
    int matchCounter = 0;
    for (char character:characters1) {
      for (int i = 0; i < word2.length(); i++) {
        if (characters2[i] == character) {
          matchCounter++;
          characters2[i] = 0;
        }
      }
    }
    return matchCounter == word1.length();
  }
}
