package uc.dn.ratingbar;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.dn.ratingbar.R;

import uc.benkkstudio.ratingbar.FlexibleRatingBar;


public class MainActivity extends Activity{

    protected FlexibleRatingBar mRb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRb = findViewById(R.id.flexibleRatingBar);
        mRb.setRating(3.5f);
    }
}
