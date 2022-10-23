package com.stanislavkinzl.customanimatedpieview.callback;

import android.view.View;
import android.view.ViewGroup;

import com.stanislavkinzl.customanimatedpieview.BasePieLegendsView;
import com.stanislavkinzl.customanimatedpieview.data.IPieInfo;

/**
 * Created by 大灯泡 on 2018/9/26.
 */
public interface OnPieLegendBindListener<V extends BasePieLegendsView> {

    V onCreateLegendView(int position, IPieInfo info);

    /**
     * 添加图例
     *
     * @param parent
     * @param view
     * @return if return true,pieview will not addView by using default method.{@link ViewGroup#addView(View)}
     */
    boolean onAddView(ViewGroup parent, V view);

}
