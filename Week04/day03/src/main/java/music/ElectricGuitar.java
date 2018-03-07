package main.java.music;

public class ElectricGuitar extends StringedInstrument {


  public ElectricGuitar(){
    setNumberOfStrings(6);
    setName("Electric Guitar");
  }

  public ElectricGuitar(int numberOfStrings){
    setNumberOfStrings(numberOfStrings);
    setName("Electric Guitar");
  }
  public void sound() {
    System.out.print("Twang\n");
  }

}
