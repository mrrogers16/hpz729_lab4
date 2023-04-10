package edu.utsa.cs3443.hpz729_lab4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.hpz729_lab4.controller.StarshipController;
import edu.utsa.cs3443.hpz729_lab4.model.Fleet;

public class StarshipActivity extends AppCompatActivity {
    private StarshipController starshipController;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starship);
        Fleet fleet = new Fleet();
        StarshipController starshipController = new StarshipController(this);

        if(fleet == null)
        {
            fleet.loadFleetCSV(this, );
        }


    }


}
