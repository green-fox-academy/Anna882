package greenfoxinheritance;

public class Person {

  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  private String gender;

  public Person(String name, int age, String gender) {
    this.setName(name);
    this.setAge(age);
    this.setGender(gender);
  }

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public void introduce() {
    System.out.println("Hy, I'm " + name + ", a " + age + " year old " + gender);
  }
  public void getGoal() {
    System.out.println("My goal is: live for the moment!");
  }
}
