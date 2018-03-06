package gardenapplication;

import java.util.List;

public class Main {
  public static void main(String[] args) {

    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");
    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");
    Garden garden = new Garden();

    garden.addFlowers(flower1);
    garden.addFlowers(flower2);
    garden.addTrees(tree1);
    garden.addTrees(tree2);

    flower1.needsWater();
    flower2.needsWater();
    tree1.needsWater();
    tree2.needsWater();
    garden.watering(40);
    garden.watering(70);
  }
}
