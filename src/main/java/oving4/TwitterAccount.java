package oving4;

import java.util.ArrayList;
import java.util.List;

public class TwitterAccount {
    private TwitterAccount account;
    private String username;

    private List<TwitterAccount> followers = new ArrayList<>();
    private List<TwitterAccount> follows = new ArrayList<>();


    TwitterAccount(String username){
        this.username = username;
    }

    public String getUserName(){
        return this.username;

    }
    public void follow(TwitterAccount account){
        this.follows.add(account);
    }
    public void unfollow(TwitterAccount account){
        this.follows.remove(account);
    }
    public boolean isFollowing(TwitterAccount account){
        if (this.followers.contains(account)) {
            return true;
        }
        return false;
    }

    public boolean isFollowedBy(TwitterAccount account){
        if (this.follows.contains(account)) {
            return true;
        }
        return false;
    }
    public void tweet(String tweet) {

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
