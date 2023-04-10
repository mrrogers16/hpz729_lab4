package edu.utsa.cs3443.hpz729_lab4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.hpz729_lab4.controller.StarshipController;

public class StarshipActivity extends AppCompatActivity {
    private StarshipController starshipController;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starship);

        StarshipController starshipController = new StarshipController()


    }


}
