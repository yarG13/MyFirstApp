package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity{
    private static String TAG = "kkkk";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newlayout);
        TextView qaq = findViewById(R.id.qaq);
        Button out = findViewById(R.id.out);
        EditText input = findViewById(R.id.inp);
        Button btn = findViewById(R.id.out);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }
    public void abc(View view){
        Log.i(TAG,"aa");
        TextView out = findViewById(R.id.qaq);
        EditText input = findViewById(R.id.inp);
        String str = input.getText().toString();
        out.setText(str);
    }
}
