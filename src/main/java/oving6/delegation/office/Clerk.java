package oving6.delegation.office;

import java.util.function.BinaryOperator;

public class Clerk implements Employee{

    private Printer printer;
    private int tasks;
    private Employee employee;


    Clerk(Printer printer){
        this.printer = printer;
    }

    @Override
    public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
        tasks++;
        return operation.apply(value1, value2);
    }

    @Override
    public void printDocument(String document) {
        if(document == null){
            throw new IllegalArgumentException("cannot be null");
        }
        tasks++;
        this.printer.printDocument(document, this);
        this.printer.printHistory.add(document);
    }

    @Override
    public int getTaskCount() {
        return this.tasks;
        
    }

    @Override
    public int getResourceCount() {
        return 1;
    }   
    
}
