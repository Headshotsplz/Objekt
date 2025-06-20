package oving5;

import java.time.LocalDateTime;

public class PeriodTicket implements Ticket {

    private final LocalDateTime start;
    private final LocalDateTime stop;

    

    public PeriodTicket(LocalDateTime start, LocalDateTime stop) {
        this.start = start;
        this.stop = stop;
    }



    @Override
    public boolean scan() {
        if (stop.equals(start)) {
            return false;
        }
        LocalDateTime now = LocalDateTime.now();
        if (now.isBefore(start) || now.isAfter(stop)) {
            return false;
        }
        if (start.isAfter(stop)) {
            throw new IllegalArgumentException("");
        }
        return true;
    }
    
}
