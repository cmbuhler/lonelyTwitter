package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Chase on 2018-01-17.
 */

public class Tweet {
    private String message;
    private Date date;
    private ArrayList<Mood> myMoodList;

    public Tweet(){
        myMoodList = new ArrayList<Mood>();
        message = null;
        date = new Date(System.currentTimeMillis());
    }

    public Tweet(String message){
        myMoodList = new ArrayList<Mood>();
        this.message = message;
        date = new Date(System.currentTimeMillis());
    }

    public Tweet(String message, Date date){
        myMoodList = new ArrayList<Mood>();
        this.message = message;
        this.date = date;

    }

    public ArrayList<Mood> getMyMoodList(){
        return myMoodList;
    }

    public void addMoodToMyMoodList(Mood m){
        myMoodList.add(m);
    }
}
