package com.example.androidBundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button implicitIntent,explicitIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        implicitIntent = findViewById(R.id.button1);
        explicitIntent = findViewById((R.id.button2));



        implicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //it is when we call system default intents like send e-mail,send sms,Call Number etc.
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"mail");
                intent.setType("text/plain");
                startActivity(intent);

            }
        });

        explicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //it is when we call our own application activity. we can also pass information from one activity
                //to another activity
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });



    }
}
