package kladd;

import java.util.ArrayList;

public class Kurs {
    private int code;
    private String name;
    private ArrayList<Student> students;

    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }

    public void addStudent(Student student){
        if (students.contains(student)) {
            throw new IllegalArgumentException("Student already enrolled");
        }

        if (student == null) {
            throw new IllegalArgumentException("student cannot be null or empty");  
        }
        enrollInCourse(student);
        students.add(student);
    }


    public void removeStudent(Student student){
        if ( !students.contains(student)) {
            throw new IllegalArgumentException("can remove if missing");
        }
        unenrollFromCourse();
        students.remove(student);
    }


    public ArrayList<Student> getEnrolledStudents(){
        return 

    }


    public int getEnrollmentCount(){

    }
    
}
