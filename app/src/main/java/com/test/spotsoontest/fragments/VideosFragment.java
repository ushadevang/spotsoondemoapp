package com.test.spotsoontest.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.test.spotsoontest.R;
import com.test.spotsoontest.config.Config;


public class VideosFragment extends Fragment {
ImageButton card1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_videos, container, false);

        card1 = (ImageButton)view.findViewById(R.id.card1);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Config.SELECTED_YOUTUBE_VIDEO_CODE = "pha37bMwWR0";

            }
        });
        return  view;
    }

}
