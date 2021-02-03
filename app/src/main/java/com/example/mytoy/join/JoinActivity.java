package com.example.mytoy.join;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.EditText;

import com.example.mytoy.R;

public class JoinActivity extends AppCompatActivity {

    EditText editPhone ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        editPhone = (EditText) findViewById(R.id.editTextTextPersonName4);
        editPhone.addTextChangedListener(new PhoneNumberFormattingTextWatcher());

    }

    public void btnNext(View view) {
        Intent intent = new Intent(this, JoinActivitySecond.class);

        intent.putExtra("result" , "OK");
        startActivity(intent);
        finish();
    }
}