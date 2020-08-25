package com.example.tutorial_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.editText1);
        password = findViewById(R.id.editText2);

        btnlogin = findViewById(R.id.btnLogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {

            String Email = email.getText().toString();
            String Password = password.getText().toString();
            @Override
            public void onClick(View view) {

                if(Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {
            //        Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
              //      startActivity(intent);
                //    finish();
                    Toast.makeText(MainActivity.this, "email", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Email is invalid", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}