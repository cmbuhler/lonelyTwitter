package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Chase on 2018-01-17.
 */

public abstract class Tweet{

    private String message;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Tweet(){
        this.message = "Default";
        this.date = new Date(System.currentTimeMillis());
    }

    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this(message);
        this.date = date;
    }
}
