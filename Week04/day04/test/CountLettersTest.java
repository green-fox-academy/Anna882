import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
  CountLetters letterCount = new CountLetters();

  @Test
  public void letterCounterTest() {
    assertEquals(2, (int) letterCount.letterCounter("ahajkh").get('a'));
  }

  @Test
  public void isKeyTest() {
    assertTrue(letterCount.letterCounter("ahamen").containsKey('m'));
  }

  @Test
  public void isNotKeyTest() {
    assertFalse(letterCount.letterCounter("littledog").containsKey('h'));
  }
}