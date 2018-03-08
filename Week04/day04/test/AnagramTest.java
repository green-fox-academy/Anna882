import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram anagram = new Anagram();

  @Test
  public void isAnagramTest() {
    assertTrue(anagram.isAnagram("hhutty", "tthyuh"));
  }

  @Test
  public void isNotAnagramTest() {
    assertFalse(anagram.isAnagram("gredsd", "gredit"));
  }
}