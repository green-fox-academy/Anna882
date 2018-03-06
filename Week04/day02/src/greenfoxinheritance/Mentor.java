package greenfoxinheritance;

public class Mentor extends Person {

  private String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.setLevel(level);
  }

  public Mentor() {
    super();
    this.level = "intermediate";
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + getLevel() + " mentor.");
  }
}
