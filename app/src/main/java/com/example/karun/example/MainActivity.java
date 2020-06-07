package com.example.karun.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void nextphoto(View view) {

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.android1);


    }
    public void clickfunction(View view){

        EditText nameEditText=(EditText) findViewById(R.id.nameEditText);

        Log.i("Info","Button Pressed");

        Log.i("values",nameEditText.getText().toString());
        Toast.makeText(this, "Hi there "+nameEditText.getText().toString(), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
