package com.gavin.asmdemo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;

/**
 * @description
 * @author: lishaojie
 * @date: 2020/10/9
 */
public class ImageViewDemo extends AppCompatImageView {
    public ImageViewDemo(Context context) {
        super(context);
    }

    public ImageViewDemo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageViewDemo(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setImageDrawable(@Nullable Drawable drawable) {
        try {
            Log.d("ImageView", "setImageDrawable: "+getResources().getResourceName(getId()));
        }catch (Exception e){
            e.getMessage();
        }

    }
}
