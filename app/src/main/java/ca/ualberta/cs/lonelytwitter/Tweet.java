/*
 * Tweet
 *
 * January 31, 2018
 *
 * Copyright © 2018 Team X, CMPUT301, University of Alberta - All rights reserved.
 * You may user, distribute, or modify this code under terms and conditions of the Code of Student Behaviour
 * at the University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author Chase Buhler
 * @version 0.1.1.12
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;

    /**
     * Construct a tweet with a null string as the message and the current date
     */
    public Tweet(){
        message = null;
        date = new Date(System.currentTimeMillis());
    }

    /**
     * Constructs a tweet with current date
     *
     * @param message tweet message
     */
    public Tweet(String message){
        this.message = message;
        date = new Date(System.currentTimeMillis());
    }

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Get the message of this tweet
     *
     * @return tweet's message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetToLongException thrown if the tweet exceeds 140 characters
     */
    public void setMessage(String message) throws TweetToLongException{
        if(message.length() > 140){
            throw new TweetToLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Get the date of this tweet
     *
     * @return tweet's date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the date of this tweet
     *
     * @param date date to be set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Check to see if the tweet is important
     *
     * @return true if the tweet is important, false otherwise
     */
    public abstract boolean isImportant();

    /**
     * Return the message of this tweet
     *
     * @return tweet's message
     */
    @Override
    public String toString(){
        return this.message;
    }
}
