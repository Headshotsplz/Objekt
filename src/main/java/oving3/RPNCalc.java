package oving3;

import java.util.ArrayList;

public class RPNCalc {

    private ArrayList<Double> stack;

    
    
    public RPNCalc(ArrayList<Double> stack) {
        this.stack = new ArrayList<>();
    }

    public void push(double value){
        stack.add(value);
    }

    public int getSize(){
        return stack.size();
    }

    public double pop(){
        if (stack.isEmpty()) {
            return Double.NaN;
        }
        return stack.remove(stack.size() - 1);
    }

    public double peek(int index){
        if (index > stack.size() - 1) {
            return Double.NaN;
        }
        return 

    }
    
}
