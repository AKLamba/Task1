package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "com.example.task1.extra.NAME";
    String ans = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void sendMessage(View v){
            Toast.makeText(this, "Name added successfully", Toast.LENGTH_SHORT).show();
            EditText name = findViewById(R.id.editText);
            String message = name.getText().toString();
            ans += message + "\n";
            //startActivity(intent);
        }

        public void openActivity(View view){
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra(EXTRA_NAME, ans);
            startActivity(intent);
        }
    }