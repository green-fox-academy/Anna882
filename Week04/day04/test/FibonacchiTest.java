import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacchiTest {

  @Test
  public void testFibonacchiCaltulator() {
    assertEquals(13, Fibonacchi.fibonacchiCaltulator(7));
  }

  @Test
  public void testFibonacchiNegativInput() {
    assertEquals(-1, Fibonacchi.fibonacchiCaltulator(-5));
  }

  @Test
  public void testFibonacchiWithZero() {
    assertEquals(0, Fibonacchi.fibonacchiCaltulator(0));
  }
}