package com.example.jenny.myview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button scale, rotate, translate, alpha;
    private ImageView animaTarget;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
//        WaveView waveView = findViewById(R.id.wave_view);
//        waveView.moveWave();

//        animView = findViewById(R.id.animView);
//        imageView = findViewById(R.id.imageView);
//        final ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "Rotation", 0, 400);
//        frameAnimator();
//        AnimatorSet animatorSet = new AnimatorSet();
//
//        animView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                frameAnimator();
//
//
//
//            }
//        });


    }
    public void alphaAnimation(){
        animation = new AlphaAnimation(0,1);
        animation.setDuration(2000);
        animation.setFillAfter(true);
        animaTarget.startAnimation(animation);
    }

    private void initView(){
        scale = findViewById(R.id.scale);
        rotate = findViewById(R.id.rotate);
        alpha = findViewById(R.id.alpha);
        translate = findViewById(R.id.translate);
        animaTarget = findViewById(R.id.anim_target);
        scale.setOnClickListener(this);
        rotate.setOnClickListener(this);
        alpha.setOnClickListener(this);
        translate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.scale:
                animation = AnimationUtils.loadAnimation(this, R.anim.scale_anim);
                animaTarget.startAnimation(animation);
                break;
            case R.id.alpha:
//                animation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
//                animaTarget.startAnimation(animation);
                alphaAnimation();
                break;
            case R.id.translate:
                animation = AnimationUtils.loadAnimation(this, R.anim.translate_anim);
                animaTarget.startAnimation(animation);
                break;
            case R.id.rotate:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
                animaTarget.startAnimation(animation);
                break;
        }
    }

//    private void frameAnimator(){
//        Keyframe frame0 = Keyframe.ofFloat(0f, 0f);
//        Keyframe frame1 = Keyframe.ofFloat(0.1f, 15f);
//        Keyframe frame2 = Keyframe.ofFloat(0.2f, 30f);
//        Keyframe frame3 = Keyframe.ofFloat(0.3f, 15f);
//        Keyframe frame4 = Keyframe.ofFloat(0.4f, 0f);
//        Keyframe frame5 = Keyframe.ofFloat(0.5f, -10f);
//        Keyframe frame6 = Keyframe.ofFloat(0.6f, -25f);
//        Keyframe frame7 = Keyframe.ofFloat(0.7f, -15f);
//        Keyframe frame8 = Keyframe.ofFloat(0.8f, -5f);
//        Keyframe frame9 = Keyframe.ofFloat(0.9f, 10f);
//        Keyframe frame10 = Keyframe.ofFloat(1f, 0f);
//
//        frame10.setInterpolator(new BounceInterpolator());
//        Keyframe scaleFrame0 = Keyframe.ofFloat(0f, 1f);
//        Keyframe scaleFrame1 = Keyframe.ofFloat(0.2f, 1.1f);
//        Keyframe scaleFrame2 = Keyframe.ofFloat(0.3f, 1.1f);
//        Keyframe scaleFrame3 = Keyframe.ofFloat(0.4f, 1.1f);
//        Keyframe scaleFrame4 = Keyframe.ofFloat(0.5f, 1.1f);
//        Keyframe scaleFrame5 = Keyframe.ofFloat(0.6f, 1.1f);
//        Keyframe scaleFrame6 = Keyframe.ofFloat(0.7f, 1.1f);
//        Keyframe scaleFrame7 = Keyframe.ofFloat(0.8f, 1.1f);
//        Keyframe scaleFrame8 = Keyframe.ofFloat(0.9f, 1.1f);
//        Keyframe scaleFrame9 = Keyframe.ofFloat(1f, 1f);
//        scaleFrame9.setInterpolator(new AnticipateOvershootInterpolator());
//
//        PropertyValuesHolder scaleXFrameHolder = PropertyValuesHolder.ofKeyframe("ScaleX", scaleFrame0, scaleFrame1,
//                scaleFrame2, scaleFrame3, scaleFrame4, scaleFrame5, scaleFrame6, scaleFrame7, scaleFrame8, scaleFrame9);
//        PropertyValuesHolder scaleYFrameHolder = PropertyValuesHolder.ofKeyframe("ScaleY", scaleFrame0, scaleFrame1,
//                scaleFrame2, scaleFrame3, scaleFrame4, scaleFrame5, scaleFrame6,scaleFrame7, scaleFrame8, scaleFrame9);
//        PropertyValuesHolder framesHolder = PropertyValuesHolder.ofKeyframe("Rotation", frame0, frame1, frame2, frame3,
//                frame4, frame5, frame6, frame7, frame8, frame9, frame10);
//        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(imageView, framesHolder, scaleXFrameHolder, scaleYFrameHolder);
//        animator.setDuration(1500);
//        animator.start();
//
//    }
//    private void startAnim(){
//        AnimationSet animationSet = new AnimationSet(true);
//        Animation translateAnimation = new TranslateAnimation(Animation.ABSOLUTE, 20, Animation.ABSOLUTE, 200,
//                Animation.ABSOLUTE, 100, Animation.ABSOLUTE,450);
//        translateAnimation.setDuration(5000);
//        Animation rotateAnimation = new RotateAnimation(0, 720, Animation.RELATIVE_TO_SELF,
//                0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        rotateAnimation.setDuration(5000);
//        Animation alphaAnimation = new AlphaAnimation(0.01f, 1.0f);
//        alphaAnimation.setDuration(5000);
//        Animation scaleAnimation = new ScaleAnimation(0, 1.8f, 0, 1.8f,
//                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        scaleAnimation.setDuration(6000);
//        animationSet.addAnimation(alphaAnimation);
//        animationSet.addAnimation(scaleAnimation);
//        animationSet.addAnimation(rotateAnimation);
//        animationSet.addAnimation(translateAnimation);
////        animationSet.setDuration(6000);
//        animationSet.setFillAfter(true);
//        animationSet.setInterpolator(new LinearInterpolator());
//
//        animView.startAnimation(animationSet);
//    }


}
