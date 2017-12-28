package com.example.sandeep.workingwithintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tvMsg=findViewById(R.id.tv_msg);
        Intent intent=getIntent();
        String message=intent.getStringExtra("msg");
        tvMsg.setText(message);
    }
}
