package oving5;

import java.time.LocalDateTime;

public class PeriodeTicket implements Ticket {

    private LocalDateTime start;
    private LocalDateTime end;

    public PeriodeTicket(LocalDateTime start, LocalDateTime end){
        if (start == null || end == null) {
            throw new IllegalArgumentException("Tid kan ikke være negativ"); 
        }
        if (end.isBefore(start)) {
            throw new IllegalArgumentException("Slutt tid kan ikke være før start tid");
        }
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean scan() {
        LocalDateTime now = LocalDateTime.now();
        
        if (! now.isBefore(start) && (!now.isAfter(end))) {
            return true;
        }
        return true;
    }
}
