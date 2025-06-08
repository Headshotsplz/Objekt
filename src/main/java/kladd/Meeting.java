package kladd;

public class Meeting {
    private String title;
    private int startHour;
    private int endHour;
    
    public Meeting(String title, int startHour, int endHour){

        this.title = title;
        setStartHour(startHour);
        setEndHour(endHour);

    }

    public String getTitle(){
        return this.title = title;
    }

    private void validateHour(int h){
        if (h < 0 || h > 23) {
            throw new IllegalArgumentException("Må være mellom 0 og 24 timer i et døgn");
        }
        this.startHour = startHour;
    }

    public void setStartHour(int h) {
        validateHour(h);
        if (endHour != 0 && h >= endHour) {
            
        }
        this.startHour = h;
    }

    public void setEndHour(int h) {
        validateHour(h);

        if (endHour <= startHour) {
        }

        this.endHour = endHour;
    }

    public static void main(String[] args) {
        Meeting m = new Meeting("Halla", 10, 12);

        System.out.println(m.getTitle());
        m.setEndHour(9);
    }

    
}
