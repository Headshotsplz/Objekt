package oving4;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private Department parent;
    private Department child;
    private List<Department> subDepartments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Department(Department parent) {
        this.parent = parent;
        this.parent.addSubDepartment(this);
    }

    public boolean containsDep(Department sub) {
        // Sjekker om det er en direkte underavdeling.
        if (subDepartments.contains(sub)) {
            return true;
        }

        // Kan også oppstå at sub er ett hakk videre under.
        // Må sjekke alle subdepartments om de ligger der.

        for (Department department : subDepartments) {
            if (department.subDepartments.contains(sub)) {
                return true;
            }
        }
        return false;
    }

    private void addSubDepartment(Department sub) {
        subDepartments.add(sub);
    }

    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Kan ikke være null");
        }

        if (employees.contains(employee)) {
            throw new IllegalArgumentException("Allere ansatt");
        }
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            throw new IllegalArgumentException("Er ikke ansatt.");
        }
        employees.remove(employee);
    }

    public Department getParent(){
        return parent;
    }
}
