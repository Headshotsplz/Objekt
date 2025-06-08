package oving1;

public class Digit {
    private int number;
    private int value;

    public Digit(int number) {
        this.number = number;
    }
    public int getValue(){
        return value;
    }
    public boolean increment(){
        if (value == number) {
            value = 0;
            return true;
        }
        return false;
    }
    
    public int getBase(){
        return number;
    }

    @Override
    public String toString() {
        if (verdi >= 0 && verdi <= 9) {
            return String.valueOf((char) ('0' + verdi));
        } else if (verdi >= 10 && verdi <= 35) {
            return String.valueOf((char) ('A' + (verdi - 10)));
        } else {
            throw new IllegalArgumentException("Ugyldig sifferverdi: " + verdi);
        }
    }


    
}
