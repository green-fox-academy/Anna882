package gardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Tree> trees;
  private List<Flower> flowers;

  public Garden() {
    trees = new ArrayList<>();
    flowers = new ArrayList<>();
  }

  public List<Tree> getTrees() {
    return trees;
  }

  public void addTrees(Tree tree) {
    this.trees.add(tree);
  }

  public List<Flower> getFlowers() {
    return flowers;
  }

  public void addFlowers(Flower flower) {
    this.flowers.add(flower);
  }

  public void watering(int waterAmount) {
    System.out.println("Watering with " + waterAmount);
    int countThistyPlants = 0;
    for (Tree tree:trees) {
      if (tree.isNeedsWater()) {
        countThistyPlants++;
      }
    }
    for (Flower flower:flowers) {
      if (flower.isNeedsWater()) {
        countThistyPlants++;
      }
    }
    waterAmount /= countThistyPlants;
    for (Tree tree:trees) {
      if (tree.isNeedsWater()) {
        tree.setCurrentWaterAmount((int) (waterAmount * tree.getWaterAbsorb()));
      }
      tree.needsWater();
    }
    for (Flower flower: flowers) {
      if (flower.isNeedsWater()) {
        flower.setCurrentWaterAmount((int) (waterAmount * flower.getWaterAbsorb()));
      }
      flower.needsWater();
    }

  }
}
