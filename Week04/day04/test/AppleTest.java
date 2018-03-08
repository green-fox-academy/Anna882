import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AppleTest {

  @Test
  public void getApple() {
    Apple apple = new Apple();
    assertEquals("apple", apple.getApple());
  }

  @Test
  public void sumTest() {
    Apple apple = new Apple();
    List<Integer> exampleList = new ArrayList<>();
    exampleList.add(4);
    exampleList.add(5);
    exampleList.add(45);
    assertEquals((Integer)54, apple.sum(exampleList));
  }

  @Test
  public void sumTestWithEmptyList() {
    Apple apple = new Apple();
    List<Integer> exampleList = new ArrayList<>();
    assertEquals((Integer)0, apple.sum(exampleList));
  }

  @Test
  public void sumTestWithOneElement() {
    Apple apple = new Apple();
    List<Integer> exampleList = new ArrayList<>();
    exampleList.add(4);
    assertEquals(4, (Object)apple.sum(exampleList));
  }

  @Test
  public void sumTestWithNull() {
    Apple apple = new Apple();
    List<Integer> exampleList = new ArrayList<>();
    assertNotEquals(null, apple.sum(exampleList));
  }
}