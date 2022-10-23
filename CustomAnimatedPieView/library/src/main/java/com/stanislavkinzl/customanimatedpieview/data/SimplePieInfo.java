package com.stanislavkinzl.customanimatedpieview.data;

import android.graphics.Bitmap;
import android.graphics.Typeface;

import androidx.annotation.Nullable;

/**
 * Created by 大灯泡 on 2017/11/7.
 */

public class SimplePieInfo implements IPieInfo {
    private double value;
    private int color;
    private String desc;
    private PieOption mPieOption;

    public SimplePieInfo() {
        mPieOption = new PieOption();
    }

    public SimplePieInfo(double value, int color) {
        this(value, color, "");
    }

    public SimplePieInfo(double value, int color, String desc) {
        this.value = value;
        this.color = color;
        this.desc = desc;
        mPieOption = new PieOption();
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SimplePieInfo setLabel(Bitmap bm) {
        mPieOption.setLabelIcon(bm);
        return this;
    }

    public SimplePieInfo setDefaultSelected(boolean defaultSelected) {
        mPieOption.setDefaultSelected(defaultSelected);
        return this;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public String getDesc() {
        return desc;
    }


    public SimplePieInfo setIconWidth(float iconWidth) {
        mPieOption.setIconWidth(iconWidth);
        return this;
    }


    public SimplePieInfo setIconHeight(float iconHeight) {
        mPieOption.setIconHeight(iconHeight);
        return this;
    }

    public SimplePieInfo setIconScaledWidth(float iconScaledWidth) {
        mPieOption.setIconScaledWidth(iconScaledWidth);
        return this;
    }


    public SimplePieInfo setIconScaledHeight(float iconScaledHeight) {
        mPieOption.setIconScaledHeight(iconScaledHeight);
        return this;
    }

    public SimplePieInfo setTypeFace(Typeface mTypeFace) {
        mPieOption.setTypeFace(mTypeFace);
        return this;
    }

    @Nullable
    @Override
    public PieOption getPieOption() {
        return mPieOption;
    }

}
