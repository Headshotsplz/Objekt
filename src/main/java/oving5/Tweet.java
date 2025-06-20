package oving5;

public class Tweet {

    private String text;
    private TwitterAccount owner;
    private Tweet originalTweet;
    private int retweetCount;


    public Tweet(TwitterAccount owner, String text){
        this.owner = owner;
        this.text = text;
        this.originalTweet = null;
        this.retweetCount = 0;

    }

    public Tweet(TwitterAccount owner, Tweet tweet){
        Tweet original = tweet.getOriginalTweet() == null ? tweet : tweet.getOriginalTweet();
        if (original.getOwner() == owner) {
            throw new IllegalArgumentException("cannot retweet own tweet");
            
        }
        this.originalTweet = original;
        this.text = original.getText();
        this.owner = owner;
        originalTweet.retweetCount++;
    }

    public String getText() {
        return this.text;
    }

    public TwitterAccount getOwner() {
        return this.owner;
    }

    public Tweet getOriginalTweet(){
        return this.originalTweet;

    }
    public int getRetweetCount(){
        return this.retweetCount;

    }



}
