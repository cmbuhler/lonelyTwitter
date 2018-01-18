package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Chase on 2018-01-17.
 */

public class SadMood extends Mood {

    private String myMood = "I am sad";

    public SadMood(){
        super();
    }
    public SadMood(Date date){
        super(date);
    }

    public String getMyMood() {
        return myMood;
    }
}
