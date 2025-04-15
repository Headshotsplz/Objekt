package oving4;

import java.util.ArrayList;
import java.util.List;

public class TwitterAccount {

    private final List<TwitterAccount> followers = new ArrayList<>();
    private final List<TwitterAccount> follows = new ArrayList<>();
    private final List<Tweet> tweets = new ArrayList<>();
    private final String username;


    TwitterAccount(String username){
        if (username == null) {
            throw new IllegalArgumentException("Username cannot be null");
        }
        this.username = username;
    }

    public String getUserName(){
        return this.username;

    }
    public void follow(TwitterAccount otherUser){
        if (otherUser == this) {
            throw new IllegalArgumentException("You cannot follow yourself");
        }

        if (otherUser == null) {
            throw new IllegalArgumentException("Account cannot be zero");
        }

        otherUser.followers.add(this);
    }

    public void unfollow(TwitterAccount otherUser){
        this.follows.remove(this);
    }

    public boolean isFollowing(TwitterAccount otherUser){

        return this.followers.contains(otherUser);
    }

    public boolean isFollowedBy(TwitterAccount otherUser){

        return this.follows.contains(otherUser);
    }

    public void tweet(String text) {
        Tweet tweet = new Tweet(this, text);
        this.tweets.add(tweet);
    }

    public void retweet(Tweet tweet){
        

    }

    public Tweet getTweet(int i){

    }

    public int getTweetCount(){

    }

    public int getRetweetCount(){

    }

}
