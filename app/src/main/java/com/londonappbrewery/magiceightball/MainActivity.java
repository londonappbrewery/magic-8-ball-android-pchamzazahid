package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybutton;
        mybutton = (Button) findViewById(R.id.mybutton);

        final ImageView myimage;
        myimage = (ImageView)findViewById(R.id.image_eightball);

        final int[] ballarray = new int[]{R.drawable.cap1,
        R.drawable.cap2,
                R.drawable.cap3,
                R.drawable.cap4,
                R.drawable.cap5
        };


        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randnumbergen = new Random();
                final int number = randnumbergen.nextInt(5);
                int imageresourceID = ballarray[number];
                myimage.setImageResource(ballarray[number]);

                ;
            }
        });


    }
}
