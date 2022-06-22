package com.example.learningnumbersforkids;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomePageFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home_page, container, false);
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        Button no1 = view.findViewById(R.id.No1);
        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out)
                        .replace(R.id.Frame, new no1()).addToBackStack(null).commit();
            }
        });
        Button no2 = view.findViewById(R.id.No2);
        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out)
                        .replace(R.id.Frame, new no2()).addToBackStack(null).commit();
            }
        });
        Button no3 = view.findViewById(R.id.No3);
        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out)
                        .replace(R.id.Frame, new no3()).addToBackStack(null).commit();
            }
        });
        Button no4 = view.findViewById(R.id.No4);
        no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out)
                        .replace(R.id.Frame, new no4()).addToBackStack(null).commit();
            }
        });
        Button no5 = view.findViewById(R.id.No5);
        no5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out)
                        .replace(R.id.Frame, new no5()).addToBackStack(null).commit();
            }
        });
        Button no6 = view.findViewById(R.id.No6);
        no6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out)
                        .replace(R.id.Frame, new no6()).addToBackStack(null).commit();
            }
        });
        Button no7 = view.findViewById(R.id.No7);
        no7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out)
                        .replace(R.id.Frame, new no7()).addToBackStack(null).commit();
            }
        });
        Button no8 = view.findViewById(R.id.No8);
        no8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out)
                        .replace(R.id.Frame, new no8()).addToBackStack(null).commit();
            }
        });
        Button no9 = view.findViewById(R.id.No9);
        no9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out)
                        .replace(R.id.Frame, new no9()).addToBackStack(null).commit();
            }
        });
        Button no10 = view.findViewById(R.id.No10);
        no10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out)
                        .replace(R.id.Frame, new no10()).addToBackStack(null).commit();
            }
        });

    }
}
















