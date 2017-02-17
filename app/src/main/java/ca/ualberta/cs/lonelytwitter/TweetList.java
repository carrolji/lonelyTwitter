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
        return tweets.contains(tweet);
    }

    public NormalTweet getTweet(int index){
        //getTweet index and return Tweet
        //return new NormalTweet("not the tweet");
        return tweets.get(0);
    }

    public void delete(NormalTweet tweet){
        tweets.remove(tweet);
    }

    public int getCount(){
        int itemCount = tweets.size();
        return itemCount;
    }
}
