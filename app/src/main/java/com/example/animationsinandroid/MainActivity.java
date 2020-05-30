package com.example.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;

    private ImageView tiger_Image;
    private ImageView lion_Image;

    private TextView txtAndroid;

    private Boolean isLionAndTigerImageShowing;

    private Boolean isHelloWorldShowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHiWorld = findViewById(R.id.txtHiWorld);
        txtHelloWorld = findViewById(R.id.txtHelloWorld);

        lion_Image = findViewById(R.id.lion_Image);
        tiger_Image = findViewById(R.id.tiger_Image);

        txtAndroid = findViewById(R.id.txtAndroid);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.i("MyTag", "HelloWorld");
//                txtHelloWorld.animate().rotation(87f).setDuration(1000);
//                txtHelloWorld.animate().scaleX(30f).setDuration(1000);
//                txtHelloWorld.animate().scaleY(30f).setDuration(1000);
//                txtHelloWorld.animate().alpha(0.5f).setDuration(3000);

//                txtHelloWorld.animate().alpha(0).setDuration(3000);
//                txtHiWorld.animate().alpha(1).setDuration(3000);

                if(isHelloWorldShowing) {
                    txtHelloWorld.animate().alpha(0).setDuration(3000);
                    txtHiWorld.animate().alpha(1).setDuration(3000);
                    isHelloWorldShowing = false;

                }else if (!isHelloWorldShowing) {
                    txtHelloWorld.animate().alpha(1).setDuration(3000);
                    txtHiWorld.animate().alpha(0).setDuration(3000);
                    isHelloWorldShowing = true;

                }
            }
        });

//        Challenge Task

//        lion_Image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (isLionAndTigerImageShowing)  {
//                    lion_Image.animate().alpha(0).setDuration(3000);
//                    tiger_Image.animate().alpha(1).setDuration(3000);
//                    isLionAndTigerImageShowing = false;
//
//                }else if (!isLionAndTigerImageShowing)  {
//                    lion_Image.animate().alpha(1).setDuration(3000);
//                    tiger_Image.animate().alpha(0).setDuration(3000);
//                    isLionAndTigerImageShowing = true;
//
//                }
//
//            }
//        });

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAndroid.animate().translationX(3000);
            }
        });

    }
}
