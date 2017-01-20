package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jirakul on 1/19/17.
 */

public abstract class CurrentMood {
    private Date date;
    private String message;

    public CurrentMood(String message) {
        this.message = message;
        this.date = new Date();
    }

    public CurrentMood(Date date, String message){
        this.message = message;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String showMood();


}
