package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

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

        Button rollButton = (Button) findViewById(R.id.rollbutton);

        final ImageView Ldice = (ImageView) findViewById(R.id.image_Ldice);
        final ImageView Rdice = (ImageView) findViewById(R.id.image_Rdice);

        final int[] DiceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Working");
                Random RandomNoGenerator = new Random();
                int number1 = RandomNoGenerator.nextInt(6);
                Ldice.setImageResource(DiceArray[number1]);
                int number2 = RandomNoGenerator.nextInt(6);
                Rdice.setImageResource(DiceArray[number2]);
            }
        });
    }
}
