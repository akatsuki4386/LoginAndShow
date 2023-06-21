package com.example.loginandshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        EditText nameInput = findViewById(R.id.username);
        EditText pwdInput = findViewById(R.id.password);
        if (nameInput.getText() != null && pwdInput.getText() != null){
            Intent intent = new Intent();
            intent.setClass(LoginActivity.this, HomeActivity.class);
            startActivity(intent);
        }
    }
}