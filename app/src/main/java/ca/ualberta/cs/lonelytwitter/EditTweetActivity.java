package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    TextView tweetText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        tweetText = (TextView) findViewById(R.id.tweetView);
        String message = getIntent().getExtras().getString("Message");
        Log.i("Message In EditTweet", message);
        tweetText.setText(message);

    }
}
