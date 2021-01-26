import CreateStudents.Student;

public class MainStudentApp {

    public static void main(String[] args) {
        Student student1 = new Student(
                "15.03.1940",
                "Müller",
                "Rem-Java-20-4");

        // PRINT FEEDBACK FROM GET-METHODS
        System.out.println(student1.getBirthDate());
        System.out.println(student1.getLastname());

        // PRINT FEEDBACK FROM "TO STRING" METHOD
        System.out.println(student1.toString());

    }


}




