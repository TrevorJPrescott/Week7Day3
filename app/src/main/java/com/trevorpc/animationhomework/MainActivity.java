package com.trevorpc.animationhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

ImageView image;
Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView);

        if(BuildConfig.FLAVOR.equals("flavor")) {
            animation =
                    AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.bounce);
        }
        if (BuildConfig.FLAVOR.equals("flavor1")) {
            animation =
            AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.grow);

        }
        if (animation!= null) { image.startAnimation(animation); }
    }
}
