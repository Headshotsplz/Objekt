package oving6.delegation.office;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BinaryOperator;

public class Manager implements Employee {

    private Collection<Employee> employees = new ArrayList<>();
    private int nextDelegation = 0;
    public Manager(Collection<Employee> employees){
        if (employees.isEmpty() || employees == null) {
            throw new IllegalArgumentException("cannot be null");
        }
        this.employees = new ArrayList<>(employees);
    }

    private Employee getTaskDelegation(){
        return this.employees.get(this.next)
    }

    @Override
    public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
        return employee.doCalculations(operation, value1, value2);
    }

    @Override
    public void printDocument(String document) {
        tasks++;
        employee.printDocument(document);
        
    }

    @Override
    public int getTaskCount() {
        return this.tasks;
    }

    @Override
    public int getResourceCount() {
        return this.tasks;
    }


}
