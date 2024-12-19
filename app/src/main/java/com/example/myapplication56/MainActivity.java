package com.example.myapplication56;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageButton nextButton, prevButton;


    private int[] images = {
            R.drawable.im1,
            R.drawable.im2,
            R.drawable.im3,
            R.drawable.im4,
            R.drawable.im5,
    };

    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        nextButton = findViewById(R.id.nextButton);
        prevButton = findViewById(R.id.prevButton);


        nextButton.setOnClickListener(v -> {
            currentIndex = (currentIndex + 1) % images.length;
            imageView.setImageResource(images[currentIndex]);
        });


        prevButton.setOnClickListener(v -> {
            currentIndex = (currentIndex - 1 + images.length) % images.length;
            imageView.setImageResource(images[currentIndex]);

  });

}}