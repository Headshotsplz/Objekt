package oving5;

import java.util.ArrayList;
import java.util.List;

public class TwitterAccount {

    private final String username;
    private List<TwitterAccount> followers;
    private List<TwitterAccount> follows;
    private TwitterAccount account;
    private List<Tweet> tweets = new ArrayList<>();

    public TwitterAccount(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public List<TwitterAccount> getFollowers() {
        return new ArrayList<>(followers);
    }

    public List<TwitterAccount> getFollows() {
        return follows;
    }

    public List<TwitterAccount> getFollowers(Comparator<TwitterAccount>){
        if()
        return new ArrayList<>()
    }
    

    public void follow(TwitterAccount account) {
        if (account == this) {
            throw new IllegalStateException("Cannot follow yourself");

        }
        if(! follows.contains(account)){
        follows.add(account);
        account.followers.add(this);
        }
    }

    public void unfollow(TwitterAccount account) {
        if (account == this) {
            throw new IllegalArgumentException("Cannot unfollow youself");
        }
        
        if (! follows.contains(account)) {
            follows.remove(account);
            account.followers.remove(this);
        }
        }

    public boolean isFollowing(TwitterAccount account) {
        if (this.follows.contains(account)) {
            return true;
        }
        return false;

    }

    public boolean isFollowedBy(TwitterAccount account) {
        return this.followers.contains(account);
    }

    public void tweet(String text) {
        tweets.add(new Tweet(this, text));
    }

    public void retweet(Tweet tweet) {
        tweets.add(new Tweet(this, tweet));

    }

    public Tweet getTweet(int i) {
        if (i > tweets.size()) {
            throw new IllegalArgumentException("Får outofbounds error");
        }
        if (i < 0) {
            throw new IllegalArgumentException("");
            
        }
        return tweets.get(tweets.size() - i);
    }

    public int getTweetCount() {
        return tweets.size();

    }

    public int getRetweetCount() {
        int reTweetCount = 0;
        for (Tweet t : tweets) {
            if (t.getOriginalTweet() == null) {
                reTweetCount += t.getRetweetCount();
            }
        }
        return reTweetCount;
    }

}
