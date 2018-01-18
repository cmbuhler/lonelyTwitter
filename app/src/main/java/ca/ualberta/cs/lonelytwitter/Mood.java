package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Chase on 2018-01-17.
 */

public abstract class Mood {
    private Date date;

    public Mood(){
        date = new Date(System.currentTimeMillis());
    }
    public Mood(Date date){
        this.date = date;
    }

    public abstract String getMyMood();
}
