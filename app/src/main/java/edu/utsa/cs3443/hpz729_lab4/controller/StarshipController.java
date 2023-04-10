package edu.utsa.cs3443.hpz729_lab4.controller;

import android.view.View;

import java.io.IOException;
import java.util.ArrayList;

import edu.utsa.cs3443.hpz729_lab4.StarshipActivity;
import edu.utsa.cs3443.hpz729_lab4.model.Starship;
import edu.utsa.cs3443.hpz729_lab4.model.Fleet;
import edu.utsa.cs3443.hpz729_lab4.model.CrewMember;

public class StarshipController implements View.OnClickListener
{
    private StarshipActivity starshipActivity;
    public StarshipController(StarshipActivity starshipActivity)
    {
        this.starshipActivity = starshipActivity;
    }

    @Override
    public void onClick(View view) {
        Fleet fleet = new Fleet();
        Starship starship = new Starship();
        try {
            fleet.loadFleetCSV(starshipActivity, "fleet.csv");
        } catch (IOException e) {
            System.err.println("ERROR: Unable to load fleet.csv");
            e.printStackTrace();
        }

        try {
            starship.loadPersonnelCSV(starshipActivity, "personnel.csv");
        } catch (IOException e) {
            System.err.println("ERROR: Unable to load personnel.csv");
            e.printStackTrace();
        }



        //load our crewmembers/person




    }
}
