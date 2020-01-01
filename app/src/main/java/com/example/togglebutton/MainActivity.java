package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton toggleButton = findViewById(R.id.id_togglebtn);
        final ImageView imageView = findViewById(R.id.id_image_view);

        imageView.setImageDrawable(getResources().getDrawable(R.drawable.offbtnimage));



        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if (toggleButton.isChecked())
                {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.onbtnimage));
                    Toast.makeText(MainActivity.this , "ON" , Toast.LENGTH_SHORT).show();

                }else {
                   imageView.setImageDrawable(getResources().getDrawable(R.drawable.offbtnimage));
                   Toast.makeText(MainActivity.this , "OFF" , Toast.LENGTH_SHORT).show();

               }

            }

        });


    }


}