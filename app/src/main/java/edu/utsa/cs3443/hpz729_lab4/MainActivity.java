package edu.utsa.cs3443.hpz729_lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import edu.utsa.cs3443.hpz729_lab4.controller.MainController;

public class MainActivity extends AppCompatActivity {

    private MainController mainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.starship1);
        Button button2 = findViewById(R.id.starship2);
        Button button3 = findViewById(R.id.starship3);

        button1.setOnClickListener(new MainController(this));
        button2.setOnClickListener(new MainController(this));
        button3.setOnClickListener(new MainController(this));
    }
}