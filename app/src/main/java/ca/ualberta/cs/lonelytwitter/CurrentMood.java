package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jirakul on 1/19/17.
 */
public abstract class CurrentMood {
    private Date date;
    private String message;

    /**
     * Instantiates a new Current mood.
     *
     * @param message the message
     */
    public CurrentMood(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Current mood.
     *
     * @param date    the date
     * @param message the message
     */
    public CurrentMood(Date date, String message){
        this.message = message;
        this.date = date;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Show mood string.
     *
     * @return the string
     */
    public abstract String showMood();


}
