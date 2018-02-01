/*
 * Tweetable
 *
 * January 31, 2018
 *
 * Copyright © 2018 Team X, CMPUT301, University of Alberta - All rights reserved.
 * You may user, distribute, or modify this code under terms and conditions of the Code of Student Behaviour
 *  at the University of Alberta.
 *  You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Defines a interface for a class that will implement a tweet message
 *
 * @author Chase Buhler
 * @see Tweet
 */
public interface Tweetable {

    /**
     * Return the message of the Tweetable
     * @return Tweet Message
     */
    public String getMessage();

    /**
     * Set the message of the Tweet
     * @param message message to be set
     * @throws TweetToLongException Thrown when character length is exceeded.
     */
    public void setMessage(String message) throws TweetToLongException;
}
