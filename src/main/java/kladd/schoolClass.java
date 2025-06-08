package kladd;

import java.util.ArrayList;

public class schoolClass {
    private String name;
    private ArrayList<String> students;

    public schoolClass(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    private  void validateStudent(String name){
        if (name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be empty");
        }
        if (students.contains(name)) {
            throw new IllegalArgumentException("Name already in list");
        }
    }

    public void addStudent(String name){
        validateStudent(name);
        students.add(name);
    }

    public void removeStudent(String name){
        validateStudent(name);
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        students.remove(name);
    }

    public int getStudentsCount() {
        return students.size();
    }

    public ArrayList<String> getStudents() {
        return new ArrayList<>(students);
    }
    
    public static void main(String[] args) {
        schoolClass sc = new schoolClass("1A");
        sc.addStudent("Kari");
        sc.addStudent("Kari"); // Kaster unntak: finnes fra før
        sc.getStudents().add("Hemmelig elev"); // Skal ikke påvirke internt!
    }
}
