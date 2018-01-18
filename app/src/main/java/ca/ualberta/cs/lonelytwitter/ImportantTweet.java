package ca.ualberta.cs.lonelytwitter;

import android.provider.ContactsContract;

import java.util.Date;

/**
 * Created by Chase on 2018-01-17.
 */

public class ImportantTweet extends Tweet{

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    public boolean isImportant(){
        return true;
    }
}
