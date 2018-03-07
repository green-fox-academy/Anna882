package greenfoxinheritance;

public class Student extends Person implements Cloneable{

  private String previousOrganization;
  private int skippedDays;

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.setPreviousOrganization(previousOrganization);
    this.skippedDays = 0;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public void setPreviousOrganization(String previousOrganization) {
    this.previousOrganization = previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }


  @Override
  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() + " from " + previousOrganization +
            " who skipped " + skippedDays + "days from the course already.");
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public void skipDays(int numberOfDays){

    this.skippedDays += numberOfDays;
  }
}
