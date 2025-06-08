package oving1;

public class UpOrDownCounter {

    private int counter;
    private int end;
    private boolean countingUp;

        public static void main(String[] args) {
            UpOrDownCounter c = new UpOrDownCounter(0, 10);

            c.getCounter();

        }
    
        public UpOrDownCounter(int start, int end) {
            if (start == end) {
                throw new IllegalArgumentException("Start cannot equal end");
            }
            this.end = end;
            this.counter = start;
            this.countingUp = start < end;
        }

        public int getCounter() {
            return counter;
        }

        public boolean count(){
            if (counter == end) {
                return false;
            }
            if (countingUp) {
                counter++;
            }
            else{
                counter--;
            }
            return counter != end;
        }
}