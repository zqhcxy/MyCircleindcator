package com.github.zqhcxy.mycircleindcator;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.github.zqhcxy.mycircleindcator.views.CircleIndicator;

/**
 * 学习参考来自：https://github.com/ongakuer/CircleIndicator
 * <p></第一：>尊重他人劳动成果，大部分内容都是出自以上的项目中
 * <p></第二：>修改地方：只是简单的添加了两个代码修改底部圆点选中与未选中背景。并不怎么实用，可以在xml布局中直接填写修改。
 * 也可以直接代码configureIndicator实现
 * <p></附：>（私人学习Demo）   XD
 */

public class MainActivity extends AppCompatActivity {
    ViewPager viewpager;
    CircleIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager = (ViewPager) findViewById(R.id.my_vp);
        indicator = (CircleIndicator) findViewById(R.id.indicator);
//        indicator.setIndicatorBackground(R.drawable.black_radius);
//        indicator.setIndicatorUnselectedBackground(R.drawable.black_radius);
        viewpager.setAdapter(new DemoPagerAdapter());

        indicator.setViewPager(viewpager);
        viewpager.setCurrentItem(2);
//        indicator.setBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent));

    }
}
