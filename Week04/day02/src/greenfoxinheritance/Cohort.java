package greenfoxinheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

  String name;
  List<Student> students;
  List<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    students = new ArrayList<Student>();
    mentors = new ArrayList<Mentor>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public List<Mentor> getMentors() {
    return mentors;
  }

  public void setMentors(List<Mentor> mentors) {
    this.mentors = mentors;
  }

  public void info() {
    System.out.println("The " + getName() + " cohort has " + students.size() + " students and " +
            mentors.size() + " mentors.");
  }
}
