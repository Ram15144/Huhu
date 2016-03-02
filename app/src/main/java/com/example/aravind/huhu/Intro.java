package com.example.aravind.huhu;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by aravind on 02/03/16.
 */
public class Intro extends AppIntro {
    Intent intent;

    @Override
    public void init(Bundle savedInstanceState) {

        addSlide(AppIntroFragment.newInstance("app","desc", android.R.drawable.ic_input_add,Color.parseColor("#FFB6C1")));
        addSlide(AppIntroFragment.newInstance("app","...", android.R.drawable.ic_input_add, R.color.app_intro_background));
        setFlowAnimation();
        setBarColor(Color.parseColor("#FF4081"));
        setSeparatorColor(Color.parseColor("#FFFFFF"));
        showStatusBar(false);
        setVibrate(true);
    }

    @Override
    public void onSkipPressed() {


    }

    @Override
    public void onNextPressed() {
        showSkipButton(true);

        setVibrateIntensity(30);

    }

    @Override
    public void onDonePressed() {
        intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        setVibrateIntensity(30);


    }

    @Override
    public void onSlideChanged() {

    }
}
