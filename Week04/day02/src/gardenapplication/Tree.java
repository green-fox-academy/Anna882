package gardenapplication;

public class Tree {

  private String treeColor;
  private int currentWaterAmount;
  private boolean needsWater;
  private double waterAbsorb = 0.4;

  public double getWaterAbsorb() {
    return waterAbsorb;
  }

  public String getTreeColor() {
    return treeColor;
  }

  public void setTreeColor(String treeColor) {
    this.treeColor = treeColor;
  }

  public int getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public void setCurrentWaterAmount(int currentWaterAmount) {
    this.currentWaterAmount = currentWaterAmount;
  }

  public boolean isNeedsWater() {
    return needsWater;
  }

  public void setNeedsWater(boolean needsWater) {
    this.needsWater = needsWater;
  }

  public Tree(String treeColor) {
    this.treeColor = treeColor;
    currentWaterAmount = 0;
  }

  public boolean needsWater() {
    if (currentWaterAmount < 10){
      System.out.println("The " + treeColor + " Tree needs water.");
      return needsWater = true;
    } else {
      System.out.println("The " + treeColor + "Tree doesn't need water.");
      return needsWater = false;
    }
  }
}
