package com.example.naruto.sims;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper vflipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int images[]={R.drawable.s1,R.drawable.s2,R.drawable.s3, R.drawable.s4};

        vflipper=findViewById(R.id.flipper);

        for(int image: images)
        {
            flipperImages(image);
        }
    }

    public void flipperImages(int image)
    {
        ImageView imgView = new ImageView(this);
        imgView.setBackgroundResource(image);
        vflipper.addView(imgView);
        vflipper.setFlipInterval(4000);
        vflipper.setAutoStart(true);
        vflipper.setInAnimation(this, android.R.anim.slide_in_left);
        vflipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}
