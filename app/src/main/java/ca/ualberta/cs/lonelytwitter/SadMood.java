package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jirakul on 1/19/17.
 */

public class SadMood extends CurrentMood {
    public SadMood(String message) {
        super(message);
    }

    public SadMood(Date date, String message) {
        super(date, message);
    }

    public String showMood() {
        return "I'm Sad";
    }
}
