package oving6.delegation.office;

import java.util.ArrayList;
import java.util.List;

public class Printer {

    private String document;
    private Employee employee;

    protected List<String> printHistory = new ArrayList<>();
    
    public void printDocument(String document, Employee employee){
        if (document == null || employee == null) {
            throw new IllegalArgumentException("Cannot be zero");
        }
        
        this.document = document;
        this.employee = employee;
        this.printHistory.add(document);
    }

    public List<String> getPrintHistory(Employee employee){
        return new ArrayList<>(printHistory);
    }
}
