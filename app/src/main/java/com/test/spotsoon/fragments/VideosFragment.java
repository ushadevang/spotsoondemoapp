package com.test.spotsoon.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.CircularArray;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.test.spotsoon.R;
import com.test.spotsoon.SptosoonHome;
import com.test.spotsoon.config.Config;


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
