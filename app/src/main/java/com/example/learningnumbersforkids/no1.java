package com.example.learningnumbersforkids;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class no1 extends Fragment implements View.OnClickListener {

    ImageSwitcher switcher;
    Integer ListImg[] = {R.drawable.no1, R.drawable.no1_1, R.drawable.no1_2, R.drawable.no1_3};
    Integer imageLength, counter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_no1, container, false);
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        TextView title = view.findViewById(R.id.HomeTitle);
        title.setText("Number One");

        imageLength = ListImg.length;
        counter = 0;

        switcher = view.findViewById(R.id.ImageSwitcher);
        switcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                ImageView imageView = new ImageView(getContext());
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,
                        ActionBar.LayoutParams.MATCH_PARENT));

                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(R.drawable.no1);
                return imageView;
            }
        });

        Button next = view.findViewById(R.id.HomeBtn);
        next.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        counter++;

        if(counter == imageLength){
            counter = 0;
            Play();
            switcher.setImageResource(ListImg[counter]);
        }else {
            Play();
            switcher.setImageResource(ListImg[counter]);
        }
    }
    public void Play() {
       MediaPlayer.create(getActivity(), R.raw.one).start();
    }
}













