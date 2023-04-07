package edu.utsa.cs3443.hpz729_lab4.controller;
import android.content.Intent;
import android.view.View;

import java.io.IOException;

import edu.utsa.cs3443.hpz729_lab4.MainActivity;

import edu.utsa.cs3443.hpz729_lab4.StarshipActivity;
import edu.utsa.cs3443.hpz729_lab4.model.Starship;       
import edu.utsa.cs3443.hpz729_lab4.model.Fleet;
import edu.utsa.cs3443.hpz729_lab4.model.CrewMember;

public class MainController implements View.OnClickListener
{
    private MainActivity mainActivity;

    public MainController(MainActivity mainActivity)
    {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view)
    {
        Fleet fleet = new Fleet();
        try {
            fleet.loadFleetCSV(mainActivity, "fleet.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(view.getContext(), StarshipActivity.class);
        intent.putExtra("intVariableName", view.getId());
        view.getContext().startActivity(intent);
    }
}
