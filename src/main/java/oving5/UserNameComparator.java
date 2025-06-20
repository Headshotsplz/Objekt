package oving5;

import java.util.Comparator;

public class UserNameComparator implements Comparator<TwitterAccount> {

    @Override
    public int compare(TwitterAccount account1, TwitterAccount account2) {
        return account1.getUsername().length() - account2.getUsername().length();

    }


    
}
