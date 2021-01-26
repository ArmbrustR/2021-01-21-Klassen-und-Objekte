package CreateStudents;

import java.util.Objects;

public class Student {
private String lastname = "Armbrust";
private String birthDate = "01.01.1980";
private String courseName = "Rem-Java-21-1";
private int studentID;


    //CREATE A CONSTRUCTOR WITH ALL REQUIRED INPUT
    public Student(String birthDate, String lastname, String courseName){
        this.birthDate = birthDate;
        this.lastname= lastname;
        this.courseName = courseName;
    }


    //LASTNAME GETTER & SETTER
    public String getLastname(){ return lastname; } //GETTER
    public void setLastname(String lastname){       //SETTER
        this.lastname = lastname;
}

    //birthDate GETTER & SETTER
    public String getBirthDate(){
        return birthDate;
    } //GETTER
    public void setBirthDate(String birthDate){         //SETTER
        this.birthDate = birthDate; }

    //courseName GETTER & SETTER
    public String getCourseName(){
        return getCourseName();
    }
    public void setCourseName(String courseName){
        this.courseName= courseName; }



    //TO STRING METHOD RETURNS ALL INPUT AS A STRING
    public String toString(){
        return birthDate + " " + lastname + " " + courseName;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(lastname, student.lastname) && Objects.equals(birthDate, student.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, birthDate);
    }
}
