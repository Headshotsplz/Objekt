package oving5.twitter;

public class Tweet {

    private TwitterAccount owner;
    private String text;
    private Tweet originalTweet;
    private int reTweetCount = 0;

    public static void main(String[] args) {

        TwitterAccount markus = new TwitterAccount("Markus");
        Tweet tweet = new Tweet(markus, "Kivtre!");

        System.out.println(tweet.getText());
        System.out.println(tweet.getOriginalTweet());
    }

    public Tweet(TwitterAccount owner, String text){
        if (owner == null) {
            throw new IllegalArgumentException("Account cannot be zero");
        }
        if (text == null) {
            throw new IllegalArgumentException("Tweet cannot be zero");
        }

        this.owner = owner;
        this.text = text;
        this.originalTweet = null;
    }


    public Tweet(TwitterAccount owner, Tweet originalTweet){
        if (owner == null) {
            throw new IllegalArgumentException("Account cannot be zero");
        }
        if (originalTweet == null) {
            throw new IllegalArgumentException("Tweet cannot be zero");
        }
        Tweet OGoriginalTweet = originalTweet.getOriginalTweet();
        
        if (originalTweet.getOwner() == owner
				|| (OGoriginalTweet != null && OGoriginalTweet.getOwner() == owner)) {
                throw new IllegalArgumentException("Cannot ikke retweete fra egen konto");
        }
        this.owner = owner;
        this.originalTweet =
				(OGoriginalTweet != null ? OGoriginalTweet : originalTweet);
        this.originalTweet.reTweetCount++;
        this.text = this.originalTweet.getText();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tweet{");
        sb.append("owner=").append(owner);
        sb.append(", text=").append(text);
        sb.append(", originalTweet=").append(originalTweet);
        sb.append(", reTweetCount=").append(reTweetCount);
        sb.append('}');
        return sb.toString();
    }
    

    public String getText(){
        return this.text;
    }

    public TwitterAccount getOwner(){
        return owner;

    }

    public Tweet getOriginalTweet(){
        return this.originalTweet;

    }

    public int getRetweetCount(){
        return this.reTweetCount;

    }
}
