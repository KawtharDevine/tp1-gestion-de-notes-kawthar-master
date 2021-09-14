import java.util.ArrayList;
import java.util.List;

/**
 * A group of students.
 */

public class Cohort {
  private final String name;
  private final List<Student> students;

  /**
   * Constructs a cohort with a name equals to the specified {@code name} and no students.
   * @param name the name of the constructed Cohort
   */

  public Cohort(String name) {
    this.name = name;
    this.students = new ArrayList<>();
  }

  /**
   * Add the specified {@code student} to the students of the cohort.
   * @param student the student to be added to the cohort
   */
  public void addStudent(Student student){
    // TODO : add code
    this.students.add(student);
  }

  /**
   * Returns the list of students of the cohort.
   * @return the list of students of the cohort.
   */
  public List<Student> getStudents(){
    // TODO : change code
    return students;
  }

  /**
   * Print via the standard output the name of the cohort and all results associated to the students with their average
   * grade.
   */
  public void printStudentsResults(){
    // TODO : add code
    System.out.println(this.name + "\n");
    for (int i = 0; i < this.students.size(); i++){
      this.students.get(i).printResults();
    }

  }

  /**
   * Returns the name of the cohort.
   * @return the name of the cohort
   */
  @Override
  public String toString() {
    // TODO : change code
    String students = this.students.get(0).toString();
    for (int i =1; i < this.students.size(); i++){
      students += " ; " + this.students.get(i).toString();
    }
    return this.name + " : " + students;
  }
}
