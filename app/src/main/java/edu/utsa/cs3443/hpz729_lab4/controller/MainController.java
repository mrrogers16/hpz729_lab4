package edu.utsa.cs3443.hpz729_lab4.controller;
import android.content.Intent;
import android.view.View;

import java.io.IOException;

import edu.utsa.cs3443.hpz729_lab4.MainActivity;
import edu.utsa.cs3443.hpz729_lab4.R;
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
        Intent intent = new Intent(mainActivity, StarshipActivity.class);
        Fleet fleet = new Fleet();

        try {
            fleet.loadFleetCSV(mainActivity, "fleet.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int id = view.getId();
        switch(id){
            case R.id.starship1:
                Starship starship1 = fleet.searchFleetByRegistry("NCC-74656");
                intent.putExtra("Starship", starship1);
                break;
            case R.id.starship2:
                Starship starship2 = fleet.searchFleetByRegistry("NCC-71854");
                intent.putExtra("Starship", starship2);
                break;
            case R.id.starship3:
                Starship starship3 = fleet.searchFleetByRegistry("NCC-75689");
                intent.putExtra("Starship", starship3);
                break;
            default:
                break;

        }
        mainActivity.startActivity(intent);
    }
}
