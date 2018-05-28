package com.example.mohamad.happybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Transition;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView TextView1,TextView2;
    protected AlphaAnimation fadeIn = new AlphaAnimation(1.0f , 0.0f ) ;
    protected AlphaAnimation fadeOut = new AlphaAnimation( 0.0f , 1.0f ) ;
    protected AlphaAnimation fadeIn1 = new AlphaAnimation(1.0f , 0.0f ) ;
    protected AlphaAnimation fadeOut1 = new AlphaAnimation( 0.0f , 1.0f ) ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView1 = (TextView) findViewById(R.id.TextView1);
        TextView2 = (TextView) findViewById(R.id.TextView2);
        TextView1.startAnimation(fadeIn);
        TextView1.startAnimation(fadeOut);
        fadeIn.setDuration(3000);
        fadeIn.setFillAfter(true);
        fadeOut.setDuration(3000);
        fadeOut.setFillAfter(true);
        fadeOut.setStartOffset(420 + fadeIn.getStartOffset());
        TextView2.startAnimation(fadeIn1);
        TextView2.startAnimation(fadeOut1);
        fadeIn1.setDuration(3000);
        fadeIn1.setFillAfter(true);
        fadeOut1.setDuration(3000);
        fadeOut1.setFillAfter(true);
        fadeOut1.setStartOffset(1500 + fadeIn1.getStartOffset());
    }
}
