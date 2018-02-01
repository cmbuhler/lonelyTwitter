/*
 * NormalTweet
 *
 * January 31, 2018
 *
 * Copyright © 2018 Team X, CMPUT301, University of Alberta - All rights reserved.
 * You may user, distribute, or modify this code under terms and conditions of the Code of Student Behaviour
 *  at the University of Alberta.
 *  You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Normal Tweet
 *
 * @author Chase Buhler
 * @see Tweet
 */
public class NormalTweet extends Tweet {

    /**
     * Create a NormalTweet Object
     *
     * @param message Tweet's message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Create a NormalTweet Object
     *
     * @param message Tweet's message
     * @param date Tweet date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Returns false always
     *
     * @return false
     */
    @Override
    public boolean isImportant() {
        return false;
    }
}
