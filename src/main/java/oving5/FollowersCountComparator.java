package oving5;

import java.util.Comparator;

public class FollowersCountComparator implements Comparator<TwitterAccount> {

    @Override
    public int compare(TwitterAccount account1, TwitterAccount account2) {
       return account2.getFollowers().size() - account1.getFollowers().size();
    }

    
}
