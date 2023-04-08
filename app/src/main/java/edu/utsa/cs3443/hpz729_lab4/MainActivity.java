package edu.utsa.cs3443.hpz729_lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import edu.utsa.cs3443.hpz729_lab4.controller.MainController;
import edu.utsa.cs3443.hpz729_lab4.controller.StarshipController;
import edu.utsa.cs3443.hpz729_lab4.model.Fleet;

public class MainActivity extends AppCompatActivity {

    private MainController mainController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.Voyager);
        Button button2 = findViewById(R.id.Venture);
        Button button3 = findViewById(R.id.Gibraltar);

        button1.setOnClickListener(new MainController(this));
        button2.setOnClickListener(new MainController(this));
        button3.setOnClickListener(new MainController(this));
    }
}

//    Load the data from the fleet.csv and personnel.csv files and create instances of the Starship, CrewMember, and Fleet classes in your MainActivity class.
//        Create the MainActivity and activity_main.xml files.
//        Create the MainController class in the edu.utsa.cs3443.abc123_lab4.controller package.
//        Implement the View.OnClickListener interface in the MainController class and handle button clicks.
//        Create the StarshipActivity and activity_starship.xml files.
//        Create the StarshipController class in the edu.utsa.cs3443.abc123_lab4.controller package.
//        Implement the logic to retrieve the data for the chosen starship and crew members in the StarshipController class.
//        Display the data on the StarshipActivity screen.
//        Create a UML diagram to represent the relationships between the classes.
//        Include Javadoc comments on all classes.