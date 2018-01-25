package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Chase on 2018-01-17.
 */

public class Tweet {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private String message;
    private Date date;

    public Tweet(){
        message = null;
        date = new Date(System.currentTimeMillis());
    }

    public Tweet(String message){
        this.message = message;
        date = new Date(System.currentTimeMillis());
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;

    }

    @Override
    public String toString(){
        return this.message;
    }
}
