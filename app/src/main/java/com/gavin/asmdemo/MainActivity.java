package com.gavin.asmdemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends BaseActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageView = findViewById(R.id.iv1);
        imageView.postDelayed((new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.mipmap.icon_group_topic);
            }
        }),10000);
    }

    public void toSecond(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
