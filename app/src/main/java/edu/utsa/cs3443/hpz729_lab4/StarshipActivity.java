package edu.utsa.cs3443.hpz729_lab4;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.hpz729_lab4.controller.StarshipController;
import edu.utsa.cs3443.hpz729_lab4.model.Fleet;
import edu.utsa.cs3443.hpz729_lab4.model.Starship;

public class StarshipActivity extends AppCompatActivity {
    private StarshipController starshipController;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starship);


        Intent intent = getIntent();
        AssetManager am = getAssets();
        String shipName = intent.getStringExtra("shipName");
        StarshipController shipController =


    }


}
