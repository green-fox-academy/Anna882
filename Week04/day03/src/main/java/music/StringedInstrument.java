package main.java.music;

public abstract class StringedInstrument extends Instrument {

  private int numberOfStrings;

  public void play() {
    System.out.print(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes ");
    sound();
  }
  public abstract void sound();

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }
}
