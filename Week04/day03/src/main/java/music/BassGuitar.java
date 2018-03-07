package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    setNumberOfStrings(4);
    setName("Bass Guitar");
  }

  public BassGuitar(int numberOfStrings) {
    setNumberOfStrings(numberOfStrings);
    setName("Bass Guitar");
  }
  public void sound() {
    System.out.println("Duum-duum-duum");
  }
}
