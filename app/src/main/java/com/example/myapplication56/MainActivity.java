package com.example.myapplication56;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewMain, imageViewForward, imageViewBackward;

    int[] imageArray = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5
    };

    int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageViewMain = findViewById(R.id.imageView7);
        imageViewForward = findViewById(R.id.imageView5);
        imageViewBackward = findViewById(R.id.imageView4);


        imageViewMain.setImageResource(imageArray[currentIndex]);


        imageViewForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex++;
                if (currentIndex >= imageArray.length) {
                    currentIndex = 0;
                }
                imageViewMain.setImageResource(imageArray[currentIndex]);
            }
        });


        imageViewBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex--;
                if (currentIndex < 0) {
                    currentIndex = imageArray.length - 1;
                }
                imageViewMain.setImageResource(imageArray[currentIndex]);
            }
        });
    }
}
