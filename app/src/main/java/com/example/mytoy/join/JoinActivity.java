package com.example.mytoy.join;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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

    public void btnAuthChk(View view) {
        // 인증 버튼 전송

        // 안내문구 dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("확인");
        builder.setMessage("인증 번호를 전송 하였습니다.");
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();

        alertDialog.show();

    }


}