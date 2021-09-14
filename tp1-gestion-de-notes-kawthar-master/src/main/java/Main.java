import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Student kawa = new Student("Kawthar", "GOUMAIDI");
        Grade grade_prog = new Grade(20);
        Grade graed_struct = new Grade(20);
        kawa.addResult("Programmation 2", grade_prog);
        kawa.addResult("Structure Discrète", graed_struct);
        List<Student> students = new ArrayList<>();
        Cohort promo_2022 = new Cohort("L2 Informatique");
        promo_2022.addStudent(kawa);
        promo_2022.printStudentsResults();
    }
}
