package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jirakul on 1/19/17.
 */

public class HappyMood extends CurrentMood{

    public HappyMood(String message) {
        super(message);
    }

    public HappyMood(Date date, String message) {
        super(date, message);
    }

    public String showMood() {
        return "I'm Happy";
    }
}
