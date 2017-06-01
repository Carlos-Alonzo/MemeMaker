package com.example.carlos.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.MemeMaker {

    //resources
   BottomPictureFragment ActualMeme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //called at time of button to apply text is pressed on top fragment
    @Override
    public void receiveMemeStrings(String top, String bot) {
        ActualMeme = (BottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        ActualMeme.setMemeText(top,bot);

    }
}
