package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Chase on 2/14/2018.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

        boolean isIllegalAdd = false;
        try{
            tweets.add(tweet);
        } catch (IllegalArgumentException e) {
            isIllegalAdd = true;
        }
        assertTrue(isIllegalAdd);
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a tweet");

        assertFalse(tweets.hasTweet(tweet));

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Message");
        Tweet tweet2 = new NormalTweet("Tweet 2");
        Tweet tweet3 = new NormalTweet("Tweet 3");

        Date date = new Date(2000, 1, 1);
        tweet1.setDate(date);
        Date date2 = new Date(2002, 1, 1);
        tweet2.setDate(date2);
        Date date3 = new Date(2003, 1, 1);
        tweet3.setDate(date3);

        tweets.add(tweet3);
        tweets.add(tweet2);
        tweets.add(tweet1);

        List<Tweet> returnedTweets = tweets.getTweets();
        assertEquals(returnedTweets.get(0), tweet1);
        assertEquals(returnedTweets.get(1), tweet2);
        assertEquals(returnedTweets.get(2), tweet3);
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a tweet");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Message");
        Tweet tweet2 = new NormalTweet("Tweet 2");
        Tweet tweet3 = new NormalTweet("Tweet 3");

        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);

        assertEquals(tweets.getCount(), 3);
    }
}
