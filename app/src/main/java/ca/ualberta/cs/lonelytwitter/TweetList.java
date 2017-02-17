package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by jirakul on 2/16/17.
 */

public class TweetList {
    private ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

    public void add(NormalTweet tweet) {
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }

    public boolean hasTweet(NormalTweet tweet){
        if (tweets.contains(tweet)) {
            return true;
        }
        return false;
    }

    public NormalTweet getTweet(int index){
        //getTweet index and return Tweet
        //return new NormalTweet("not the tweet");
        
        Collections.sort(tweets, new Comparator<NormalTweet>() {
            public int compare(NormalTweet tweet1, NormalTweet tweet2) {
                return tweet1.getDate().compareTo(tweet2.getDate());
            }
        });
        return tweets.get(index);
    }

    public void delete(NormalTweet tweet){
        tweets.remove(tweet);
    }

    public int getCount(){
        int itemCount = tweets.size();
        return itemCount;
    }
}
