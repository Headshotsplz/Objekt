package oving1;

public class Location {

    private int x;
    private int y;
    
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void up(){
        y++;
    }

    public void down(){
        y--;
    }

    public void left(){
        x--;
    }

    public void right(){
        x++;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Location{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

}
