package kladd;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private ArrayList<Kurs> courses;

    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }
    public String getName() {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be zero");
        }
        return name;
    }
    public void enrollInCourse(Kurs course){
        if (courses.contains(course)) {
            throw new IllegalArgumentException("student already enrolled");
        }
        courses.add(course);
    }

    public void unenrollFromCourse(Kurs course){
        if (! courses.contains(course)) {
            throw new IllegalArgumentException("")
            
        }

    }

    public ArrayList getCourses(){
        return courses = new ArrayList<>();
    }
    
}
