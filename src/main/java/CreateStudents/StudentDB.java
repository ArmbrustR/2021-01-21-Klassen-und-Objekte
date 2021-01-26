package CreateStudents;
import CreateStudents.Student;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StudentDB {
    Student[] students = new Student[0];
    // Ruft den Student-Constuctor auf, Name = students und mach nun
    // einen neuen Array name=students mit new Student[0]<- also leer!

    public StudentDB(Student[] students){
        this.students = students; }
    // Setter methode überschreibt nun den students array

    public int numberOfStudents() {
        return students.length; }
    // return die Anzahl der Inhalte im Array

    @Override
   public String toString(){
        return Arrays.toString(students); }

    public List list(){
        return Arrays.asList(students); }

    public String randomStudent(){
        int randomNumber = new Random().nextInt(students.length);
        return students[randomNumber].toString(); }


    public void addNewStudent(Student newStudent){
        Student[] addedStudent = new Student[students.length+1];
        for (int i = 0; i < students.length; i++) {
            addedStudent[i] = students[i]; }
        addedStudent[addedStudent.length-1] = newStudent;
        students = addedStudent;
    }

    public void removeOneStudent(){
        Student[] = new Student


    }
}
