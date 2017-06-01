package com.example.carlos.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BottomPictureFragment extends Fragment {

    private static TextView uppertext;
    private static TextView lowertext;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottompicfragment, container, false);
        uppertext = (TextView)view.findViewById(R.id.uppertext);
        lowertext = (TextView)view.findViewById(R.id.lowertext);
        return view;
    }

    public void setMemeText(String top, String bot)
    {
        uppertext.setText(top);
        lowertext.setText(bot);



    }

}
