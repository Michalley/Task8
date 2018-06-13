package com.example.tesk8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    ImageButton btn;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.iv);
        btn = findViewById(R.id.btn);
    }

    public void click(View view) {
        x= (int) (Math.random()*3+1);
        if (x==1) {
            btn.setImageResource(R.drawable.number1);
            iv.setImageResource(R.drawable.mario);
        }
        else{
            if (x==2) {
                btn.setImageResource(R.drawable.number2);
                iv.setImageResource(R.drawable.domino);
            }
            else{
                if (x==3) {
                    btn.setImageResource(R.drawable.number3);
                    iv.setImageResource(R.drawable.cocacola);
                }
                }
            }
        }
    }

