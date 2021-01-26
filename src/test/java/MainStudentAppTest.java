import CreateStudents.Student;
import org.junit.Test;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.*;
public class MainStudentAppTest {

    @Test
    public void testBirthdateSet() {

        //GIVEN
        String newBirthDate = "13.03.1940";
        Student StudentTest = new Student(newBirthDate, "Müller", "Rem-Java-20-4");

        //WHEN
        StudentTest.setBirthDate(newBirthDate);
        String returnedBirthDate = StudentTest.getBirthDate();

        //THEN
        assertEquals(newBirthDate, returnedBirthDate);
    }

    @Test
    public void testStringReturn() {

        //GIVEN
        String testLastname = "Mustermann";
        String testBirthDate = "23.05.1990";
        String testCourseName = "Rem-Java-21-4";
        String expectedString = testBirthDate + " " + testLastname + " " + testCourseName;

        Student StudentTest = new Student(testBirthDate, testLastname, testCourseName);

        //WHEN
        String returnedFullStringOfStudent = StudentTest.toString();

        //THEN
        assertEquals(expectedString, returnedFullStringOfStudent);
        System.out.println(returnedFullStringOfStudent);
    }

    @Test
    public void testStudentDublicates() {
        //GIVEN
        Student StudentTest1 = new Student(
                "01.01.1900",
                "Schmitz",
                "Java-Rem-21-3");
        Student StudentTestSame1 = new Student(
                "01.01.1900",
                "Schmitz",
                "Java-Rem-21-3");
        Student StudentTestDiffrent1 = new Student(
                "01.02.1900",
                "Schmitz",
                "Java-Rem-21-3");

        //WHEN
        //not needed?

        //THEN
        assertEquals(StudentTest1, StudentTestSame1);
        assertNotEquals(StudentTestDiffrent1, StudentTest1);


    }
}
