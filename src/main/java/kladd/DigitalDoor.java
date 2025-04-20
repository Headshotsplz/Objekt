package kladd;

public class DigitalDoor {
    private String correctPin;
    private boolean isLocked;
    private int failedAttempts = 0;

    public void enterPin(String pin){
        if (pin.equals(correctPin)) {
            isLocked = false;
            failedAttempts = 0;
        }
        if (!pin.equals(correctPin)) {
            failedAttempts += 1;
        }
        if (failedAttempts == 3) {
            throw new IllegalArgumentException("Døren er låst permanent");
        }
    }
    public void lock(){
        isLocked = true;
    }
    public boolean isLocked(){
        return isLocked;
    }
    public String getCorrectPin() {
        return correctPin;
    }
    public int getFailedAttempts() {
        return failedAttempts;
    }
}
