package com.example.uteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.uteapp.R;

public class MainActivity extends AppCompatActivity {
    private Button signUpBtt, signInBtt;
    private TextView forgetPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUpBtt = (Button) findViewById(R.id.signup_btt);
        signUpBtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUpUI();
            }
        });

        forgetPass = (TextView) findViewById(R.id.forgetPass);
        forgetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgetPassEvent();
            }
        });

        signInBtt = findViewById(R.id.signin_btt);
        signInBtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List();
            }
        });
    }

    public void openSignUpUI() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void forgetPassEvent() {
        Intent intent = new Intent(this, ForgetPass.class);
        startActivity(intent);
    }

    public  void List() {
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }
}