package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private TextView textView5; //Тут выводим фунты
    private Button button;
    private Button button2; //Кнопка реализации калькулятора
    private ImageButton imgButton;
    private CheckBox checkBox;
    private EditText editText;

    private int count = 0;
    private double funts = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                String text = "Ты нажал кнопку: " + String.valueOf(count);
                textView.setText(text);
            }
        });
        textView5 = findViewById(R.id.textView5);
        button2 = findViewById(R.id.button2);
        editText = findViewById(R.id.editTextText);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editText.getText().toString();
                funts =  Double.parseDouble(input) * 2.20462;
                funts = Math.round(funts * 100) / 100.0;
                String text = "Фунтов = " + String.valueOf(funts);
                textView5.setText(text);
            }
        });
    }
}