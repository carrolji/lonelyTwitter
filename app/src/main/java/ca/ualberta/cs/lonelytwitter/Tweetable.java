package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jirakul on 1/19/17.
 */

public interface Tweetable {
    //everything must be public
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;

}
