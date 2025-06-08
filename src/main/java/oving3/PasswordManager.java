package oving3;

public class PasswordManager {
    private String password;

    public PasswordManager(String initialpassword) {
        this.password = initialpassword;
    }
    
    public boolean checkPassword(String input){
        if (input.equals(password)) {
            return true;
        }
        return false;
    }
    public boolean changePassword(String oldPassword, String newPassword){
        if (oldPassword.equals(password) && newPassword.length() >= 8) {
        password = newPassword;
        return true;
    }
    return false;
    }

    public String getPasswordMasked(){
        return "*".repeat(password.length());
    }
}
