package edu.utsa.cs3443.hpz729_lab4.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import edu.utsa.cs3443.hpz729_lab4.MainActivity;
import edu.utsa.cs3443.hpz729_lab4.R;
import edu.utsa.cs3443.hpz729_lab4.StarshipActivity;

public class MainController implements View.OnClickListener
{
    @Override
    public void onClick(View view)
    {
        Intent intent = new Intent(view.getContext(), StarshipActivity.class);
        intent.putExtra("intVariableName", view.getId());
        view.getContext().startActivity(intent);

    }
}
