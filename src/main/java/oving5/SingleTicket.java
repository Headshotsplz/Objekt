package oving5;

public class SingleTicket implements Ticket {

    private boolean valid = false;



    @Override
    public boolean scan() {
        if (valid == false) {
            valid = true;
            return true;
        }
        return false;
    }


    
}
