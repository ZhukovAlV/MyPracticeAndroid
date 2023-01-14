package com.example.mypractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myText;
    private ConstraintLayout rootLayout;

    private Button redButton;
    private Button yellowButton;
    private Button greenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myText = findViewById(R.id.myTextView);
        rootLayout = findViewById(R.id.layout_root);

        // 2 способ
        redButton = findViewById(R.id.button_red);
        yellowButton = findViewById(R.id.button_yellow);
        greenButton = findViewById(R.id.button_green);

        redButton.setOnClickListener(e -> {
            myText.setText(R.string.red);
            rootLayout.setBackgroundResource(R.color.red);
        });
        yellowButton.setOnClickListener(e -> {
            myText.setText(R.string.yellow);
            rootLayout.setBackgroundResource(R.color.yellow);

        });
        greenButton.setOnClickListener(e -> {
            myText.setText(R.string.green);
            rootLayout.setBackgroundResource(R.color.green);
        });
    }

    public void clickRedButton(View view) {
/*        myText.setText("Красный");
        rootLayout.setBackgroundColor(getResources().getColor(R.color.red, null));*/
    }

    public void clickYellowButton(View view) {
/*        myText.setText(R.string.yellow);
        rootLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));*/
    }

    public void clickGreenButton(View view) {
/*        myText.setText(getResources().getText(R.string.green));
        rootLayout.setBackgroundColor(Color.GREEN);*/
    }
}