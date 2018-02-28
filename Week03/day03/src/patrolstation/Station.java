package patrolstation;

public class Station {
  private int gasAmount;

  public void refill(Car car){
    gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }
}