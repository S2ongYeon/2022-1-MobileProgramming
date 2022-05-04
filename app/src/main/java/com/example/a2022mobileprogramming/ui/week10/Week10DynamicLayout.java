package com.example.a2022mobileprogramming.ui.week10;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.a2022mobileprogramming.R;

public class Week10DynamicLayout extends AppCompatActivity {
    LinearLayout mLinearLayout;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLinearLayout = new LinearLayout(this);

        //Instantiate an ImageView and define its properties
        ImageView img =  new ImageView(this);
        Drawable myImage = getResources().getDrawable(R.drawable.ic_launcher);
        img.setImageDrawable(myImage);
        //to match the Drawable's dimensions
        img.setLayoutParams(new Gallery.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, Gallery.LayoutParams.WRAP_CONTENT));

        //Add the ImageView to the layout and set the layout as the content view
        mLinearLayout.addView(img);

        setContentView(mLinearLayout);
    }
}
