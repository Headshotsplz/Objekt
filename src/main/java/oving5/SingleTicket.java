package oving5;

public class SingleTicket implements Ticket {

    private int scans = 0;

    public static void main(String[] args) {
        SingleTicket ticket = new SingleTicket();


    }

    @Override
    public boolean scan() {
        if(this.scans == 0){
            this.scans++;
            return true;
        }
        return false;

    }

        
        
}
