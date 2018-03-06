package gardenapplication;

public class Flower extends Plant {


  public Flower(String color) {
    this.setColor(color);
    this.setCurrentWaterAmount(0);
    this.setWaterAbsorb(0.75);
  }

  public void needsWater() {
    if (this.getCurrentWaterAmount() < 5){
      System.out.println("The " + getColor() + " Flower needs water.");
      setNeedsWater();
    } else {
      System.out.println("The " + getColor() + " Flower doesn't need water.");
      resetNeedsWater();

    }
  }
}
