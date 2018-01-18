package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Chase on 2018-01-17.
 */

public class NormalTweet extends Tweet {

    public NormalTweet(String message){
        super(message);

    }

    public NormalTweet(String message, Date date){
        super(message, date);
    }
}
