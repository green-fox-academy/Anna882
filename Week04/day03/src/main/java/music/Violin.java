package main.java.music;

public class Violin extends StringedInstrument{

  public Violin() {
    setNumberOfStrings(4);
    setName("Violin");
  }

  public void sound(){
    System.out.println("Screech");
  }
}
