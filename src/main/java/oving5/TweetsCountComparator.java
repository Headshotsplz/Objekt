package oving5;

import java.util.Comparator;

public class TweetsCountComparator implements Comparator<TwitterAccount> {

    @Override
    public int compare(TwitterAccount account1, TwitterAccount account2) {
        return account2.getTweetCount() - account1.getRetweetCount();
    }

    
}
