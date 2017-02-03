package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jirakul on 1/19/17.
 */
public class HappyMood extends CurrentMood{

    /**
     * Instantiates a new Happy mood.
     *
     * @param message the message
     */
    public HappyMood(String message) {
        super(message);
    }

    /**
     * Instantiates a new Happy mood.
     *
     * @param date    the date
     * @param message the message
     */
    public HappyMood(Date date, String message) {
        super(date, message);
    }

    public String showMood() {
        return "I'm Happy";
    }
}
