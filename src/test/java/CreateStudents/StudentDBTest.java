package CreateStudents;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 class StudentDBTest {

    @Test
    public void emptyDBemptyStudents(){
        StudentDB studentDB = new StudentDB(new Student[0]);

        int numberOfStudentsTestResult = studentDB.numberOfStudents();
        assertEquals(0, numberOfStudentsTestResult);
    }

     @Test
     public void listStudentsBiggerThan1(){
        // GIVEN
        Student student1 = new Student(
                "01.05.1930",
                "Herrmann",
                "Java-21-5");
        Student student2 = new Student(
                "04.05.1930",
                "Meier",
                "Java-21-5");

        Student[] students = {student1, student2};

        //WHEN
        StudentDB studentDB = new StudentDB(students);

        //THEN
        int numberOfStudentsTestResult = studentDB.numberOfStudents();
        assertEquals(2, numberOfStudentsTestResult);

        System.out.println(studentDB.toString());
        System.out.println(studentDB.list());
        System.out.println(studentDB.randomStudent());


    }



}