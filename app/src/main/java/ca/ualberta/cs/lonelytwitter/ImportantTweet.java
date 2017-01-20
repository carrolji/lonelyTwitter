package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jirakul on 1/19/17.
 */


public class ImportantTweet extends Tweet {
    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    public ImportantTweet(String message) {
        super(message);
    }
    @Override
    public Boolean isImportant(){
        return true;
    }
}
