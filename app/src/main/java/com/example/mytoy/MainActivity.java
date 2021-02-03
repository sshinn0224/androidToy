package com.example.mytoy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mytoy.R;
import com.example.mytoy.join.JoinActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void btnToJoin(View view) {
        Intent joinIntent = new Intent(this, JoinActivity.class);

        startActivity(joinIntent);
    }
}