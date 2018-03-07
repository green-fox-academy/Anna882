package main.java.animals;

public abstract class Animal {
  private String name;
  private int age;
  private String gender;
  private int weight;

  public Animal(){};

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract String breed();

  public abstract void eat();

  public abstract void move();
}
