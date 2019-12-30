package uc.dn.ratingbar;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.dn.ratingbar.R;

import uc.benkkstudio.ratingbar.CustomRatingBar;


public class MainActivity extends Activity implements CustomRatingBar.OnStarChangeListener {

    protected CustomRatingBar mRb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRb = (CustomRatingBar) findViewById(R.id.rb);
        mRb.setOnStarChangeListener(this);
        mRb.setTint(getResources().getColor(R.color.colorAccent));
    }

    @Override
    public void onStarChange(CustomRatingBar ratingBar, float star) {
        Log.d("MainActivity", "star:" + star);
    }
}