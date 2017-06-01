package com.example.carlos.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import java.lang.ClassCastException;



public class TopSectionFragment extends Fragment
{
    //resources
    private static EditText toptext;
    private static EditText bottext;
    private Button apply;
    MemeMaker AttachedAct;

    //Public Interface to pass on the text on this fragment
    public interface MemeMaker
    {
        public void receiveMemeStrings(String top, String bot);

    }

    //


    @Override
    public void onAttach(Context context) throws ClassCastException {
        super.onAttach(context);

        AttachedAct =(MemeMaker) context;
    }

    //Needed in order to have have a fragment
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //how to acquire the xml to this fragment class
        View view= inflater.inflate(R.layout.topsectionfragment,container,false);


        //resources
        toptext = (EditText) view.findViewById(R.id.toptext);
        bottext = (EditText) view.findViewById(R.id.bottext);
        apply = (Button) view.findViewById(R.id.apply);

        //listen for button click event
        apply.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v) {giveMemeText(v);}
                }
            );

        return view;
    }

    public void giveMemeText(View v)
    {
        AttachedAct.receiveMemeStrings(toptext.getText().toString(),bottext.getText().toString());
    }
}

