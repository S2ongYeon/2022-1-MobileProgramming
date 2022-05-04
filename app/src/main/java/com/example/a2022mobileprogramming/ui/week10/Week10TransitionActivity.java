package com.example.a2022mobileprogramming.ui.week10;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.a2022mobileprogramming.R;

public class Week10TransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week10_trasition);

        ImageButton button = (ImageButton) findViewById(R.id.button);
        TransitionDrawable drawable = (TransitionDrawable) button.getDrawable();
        drawable.startTransition(5000);
    }
}
