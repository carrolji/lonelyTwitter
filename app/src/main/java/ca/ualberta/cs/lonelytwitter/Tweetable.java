package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jirakul on 1/19/17.
 */
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return the message
     */
//everything must be public
    public String getMessage();

    /**
     * Sets message.
     *
     * @param string the string
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String string) throws TweetTooLongException;

}
