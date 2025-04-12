package oving3;

public class Stream {

    private int grense;

    

    public Stream(int grense) {
        this.grense = grense;
    }

    public void skrivPartall(){
        for (int i = 0; i < grense; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Stream tp = new Stream(20);
        tp.skrivPartall();
        

    }


}
