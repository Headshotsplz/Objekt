package oving4;

public class Employee {

    private Department department;

    public Employee(Department department) {
        this.department = department;
        this.department.addEmployee(this);
    }

    public Department getDepartment() {
        return this.department;
    }

    public void promote() {
        if (this.department.getParent() == null) {
            throw new IllegalStateException("Jobber allerede øverst i hierariket");
        }
        // Må fjerne ansatt fra ansattlista i subdep
        this.department.removeEmployee(this); // this.department = salg.øst

        // Oppdaterer slik nåværende department, altså tilstand er parent, altså nye
        // department.
        this.department = this.department.getParent(); //this.department = salg.

        // Legger til ansatt i ny ansatt liste.
        this.department.addEmployee(this);
    }

    public void quit() {
        if (this.department == null) {
            throw new IllegalStateException("Jobber ingen steder");
        }

        this.department.removeEmployee(this);
        this.department = null;
    }

    public static void main(String[] args) {
        Department salg = new Department();
        Employee markus = new Employee(salg);

        salg.removeEmployee(markus);

    }
}
