package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jirakul on 1/19/17.
 */
public class SadMood extends CurrentMood {
    /**
     * Instantiates a new Sad mood.
     *
     * @param message the message
     */
    public SadMood(String message) {
        super(message);
    }

    /**
     * Instantiates a new Sad mood.
     *
     * @param date    the date
     * @param message the message
     */
    public SadMood(Date date, String message) {
        super(date, message);
    }

    public String showMood() {
        return "I'm Sad";
    }
}
