public class Course {

    private String courseCode;
    private int credits;
    private int passedCredits;

    public Course(String courseCode, int credits, int passedCredits) {
        this.courseCode = courseCode;
        setCredits(credits);
        setPassedCredits(passedCredits);
    }

    public void validateCredits(int c){
        if (c < 0) {
            throw new IllegalArgumentException("credit cannot be negativ");
        }
        if (c > 31) {
            throw new IllegalArgumentException("credit can be max 30");
        }

    }

    public void setCredits(int c) {
        validateCredits(c);
        this.courseCode = courseCode;
    }

    public void setPassedCredits(int p) {
        if (p < 0) {
            throw new IllegalArgumentException("");
        }
        if (p > this.credits) {
            throw new IllegalArgumentException("");
        }
        this.passedCredits = passedCredits;
    }

    public double getProgress(){
        if (credits == 0) {
            return 0.0;
        }
        return ((double) this.passedCredits / this.credits) * 100;
    }

    
}
