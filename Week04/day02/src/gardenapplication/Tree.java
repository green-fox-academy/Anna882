package gardenapplication;

public class Tree extends Plant {

  public Tree(String color) {
    this.setColor(color);
    this.setCurrentWaterAmount(0);
    this.setWaterAbsorb(0.4);
  }

  public void needsWater() {
    if (getCurrentWaterAmount() < 10){
      System.out.println("The " + getColor() + " Tree needs water.");
      setNeedsWater();
    } else {
      System.out.println("The " + getColor() + "Tree doesn't need water.");
      resetNeedsWater();
    }
  }
}
