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
    private String shipName;
    public MainController(String shipName)
    {
        this.shipName = shipName;
    }

    @Override
    public void onClick(View view)
    {



        Intent intent = new Intent(view.getContext(), StarshipActivity.class);
        intent.putExtra("shipName", shipName);
        view.getContext().startActivity(intent);
    }

}

