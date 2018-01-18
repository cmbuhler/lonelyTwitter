package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Chase on 2018-01-17.
 */

public class HappyMood extends Mood {
    private String myMood = "I am happy!";

    public HappyMood(){
        super();
    }

    public HappyMood(Date date){
        super(date);
    }

    public String getMyMood() {
        return myMood;
    }
}
