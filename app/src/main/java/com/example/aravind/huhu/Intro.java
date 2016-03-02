package com.example.aravind.huhu;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by aravind on 02/03/16.
 */
public class Intro extends AppIntro2 {
    Intent intent;

    @Override
    public void init(Bundle savedInstanceState) {

        addSlide(AppIntroFragment.newInstance("app","desc", android.R.drawable.ic_input_add,Color.parseColor("#FFB6C1")));
        addSlide(AppIntroFragment.newInstance("app","...", android.R.drawable.ic_input_add, R.color.app_intro_background));
        addSlide(new Signup());
        setFlowAnimation();
        showStatusBar(false);
        setVibrate(true);
    }


    @Override
    public void onNextPressed() {


        setVibrateIntensity(30);

    }

    @Override
    public void onDonePressed() {
        intent=new Intent(this,MainActivity.class);
        setVibrateIntensity(30);
        startActivity(intent);


    }

    @Override
    public void onSlideChanged() {

    }
}
