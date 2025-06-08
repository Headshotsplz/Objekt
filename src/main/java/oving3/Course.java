package oving3;

import java.util.ArrayList;

public class Course {
    
    private String code;
    private String title;
    ArrayList<Student> students;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
        this.students = new ArrayList<>();
    }

    public void enroll(Student student){
        if (! students.contains(student)) {
            students.add(student);
        }
    }
    public boolean isEnrolled(Student student){
        if (students.contains(student)) {
            return true;
        }
        return false;
    }
    public ArrayList<Student> getStudents(){
        return new ArrayList<>(students);
    }

    @Override
    public String toString() {
        return students.containsAll(student);
    }

    

    
}
