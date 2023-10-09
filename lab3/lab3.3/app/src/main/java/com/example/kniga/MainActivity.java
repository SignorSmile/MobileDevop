package com.example.kniga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Kniga book = new Kniga();
        book.setAuthor("Anton");
        book.setName("Hello World!");
        book.setPrice(0);
    }
}