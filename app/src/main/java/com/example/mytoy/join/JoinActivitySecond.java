package com.example.mytoy.join;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mytoy.R;

public class JoinActivitySecond extends AppCompatActivity {
    TextView text1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_second);



        Intent intent = getIntent();
        String resStr = intent.getStringExtra("result");

        text1 = (TextView) findViewById(R.id.textView);
        text1.append(resStr);

    }
}