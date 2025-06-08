package kladd;

public class User {

    private String username;
    private String displayName;

    public User(String username, String displayName){
        this.username = username;
        this.displayName = displayName;
    }

    public String setUsername(String u){
        if (u == Null) {
            throw new zeroargumentException("");
        }
        if (u < 3) {
            throw new IllegalArgumentException("");
        }
        if (u.contains(" ")) {
            throw new IllegalArgumentException("");
        }
        
        return u;
    }

    public String setDisplayName(String d){
        trim(d);
    }

    public String getUsername() {
        return username;
    }

    public String getDisplayName() {
        return displayName;
    }
}
