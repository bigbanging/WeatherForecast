package com.litte.weatherforecast;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GuideActivity extends AppCompatActivity {

    @BindView(R.id.imageView_guide)
    ImageView imageView_guide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        //关联注解框架  初始化控件
        ButterKnife.bind(this);
        imageView_guide.setBackgroundResource(R.drawable.guide_anim);
        //获得动画对象
        AnimationDrawable drawable = (AnimationDrawable) imageView_guide.getBackground();
        //开启动画
        drawable.start();
        //添加定时器三秒跳转
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(GuideActivity.this,MainActivity.class));
                finish();
            }
        },3000);
    }
}
