package edu.utsa.cs3443.hpz729_lab4.model;

/**
 * This class represents a Fleet object
 * It has properties for the Fleets name and an ArrayList of Starship objects.
 * This class also containins all setters and getters as well as a
 * method for returning the number of personel and an overwritten toString method that calls
 * the toString from the CrewMember class. This class also contains all setters, getters, and constructors,
 * as well as a methods for returning the number of Starships in an ArrayList of Starship objects. It also
 * contains a loadStarShip method to look through a specified directory and read in folder object which
 * reads in a file object of .csv files. All Fleet, Starship, and Crew Members are populated from the
 * fields in these files.
 *
 * @author Mickey Clarke hpz729
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 */
import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fleet {

    private String name; //The name of the fleet.
    private ArrayList<Starship> starShipList = new ArrayList<>(); //ArrayList of Starship objects



    public Fleet(){}
    /**
     * Fleet Constructor
     * @param name - String
     */
    public Fleet(String name) {
        this.setFleetName(name);
    }

    /**
     *
     * @param starShipList
     * @param name
     * @return
     */
    public Starship search_ShipName(ArrayList<Starship> starShipList, String name)
    {
        for(Starship i : starShipList)
        {
            if(i.getShipName().equals(name))
            {
                return i;
            }
        }
        return null;
    }
    /**
     *
     * @param starShipList
     * @param registry
     * @return
     */
    public Starship search_ShipID(ArrayList<Starship> starShipList, String registry)
    {
        for(Starship i : starShipList)
        {
            if(i.getRegistry().equals(registry))
            {
                return i;
            }
        }
        return null;
    }

    /**
     *
     * @param context
     * @param filepath
     * @throws IOException
     */
    public void loadFleetCSV(Context context, String filepath) throws IOException
    {
        AssetManager assetManager = context.getAssets();
        InputStream inputStream = assetManager.open(filepath);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        while((line = br.readLine()) != null)
        {
            String[] fields = line.split(",");
            if(fields.length == 3)
            {
                String shipName = fields[0];
                String shipRegistry = fields[1];
                String shipClass = fields[2];
                Starship ship = new Starship(shipName, shipRegistry, shipClass);
                starShipList.add(ship);
            }
        }
    }



    /**
     * This is a method that takes in a String that corresponds to the directory
     * path of your .csv files that you want to load your objects from. It should
     * take in the name of a folder that contains files. The method will create an
     * Array of files built from the folder. A check to make sure that the file is a
     * file and ends with .csv is run. An exception is thrown if there is an error
     * during the file reading process. The code uses the try-with-resources
     * statement to automatically close the BufferedReader when done.
     *
     * @param directoryName - String
     * @throws Exception This method returns nothing
     */
    public void loadStarships(String directoryName) throws Exception {
        String line = "";
        String seperator = ",";
        boolean firstLine = true;
        File folder = new File(directoryName);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            firstLine = true;
            if (listOfFiles[i].isFile() && listOfFiles[i].getName().endsWith(".csv")) {
                try (BufferedReader buffer = new BufferedReader(new FileReader(listOfFiles[i]))) {
                    while ((line = buffer.readLine()) != null) {
                        String[] fields = line.split(seperator);

                        if (firstLine) {
                            firstLine = false;
                            Starship starShip = new Starship(fields[0], fields[1], fields[2]);
                            starShipList.add(starShip);
                        }
                        if (fields.length == 4) {
                            CrewMember crewMember = new CrewMember(fields[0], fields[1], fields[2], fields[3]);
                            starShipList.get(starShipList.size() - 1).addCrewMember(crewMember);
                        }

                    }
                }
            }
        }
    }

    /**
     * This toString method calls on the Starship toString method which calls the
     * crew member toString to build the final output for the program. The ArrayList
     * of Starships are looped through and appended to the end of String result.
     *
     * @return result
     */
    @Override
    public String toString() {

        String result = "-----------------------------\n" + getFleetName() + "  \n" + "-----------------------------\n";

        for (int i = 0; i < starShipList.size(); i++) {
            result += starShipList.get(i).toString() + "\n";
        }

        return result;
    }

    /**
     * This method checks to see if starShipList is null. If it is a new ArrayList
     * of Starships is created. If an ArrayList of Starships already exists,
     * Starship @param s is added to the end of the ArrayList.
     *
     * @param s Starship
     * returns nothing
     */
    public void addStarship(Starship s) {
        if (starShipList == null) {
            starShipList = new ArrayList<Starship>();
        } else {
            starShipList.add(s);
        }
    }

    /**
     * This method loops through the starShipList ArrayList and incriments a counter
     * in correspondance with the size of the ArrayList and returns and int
     * representing the number of ships in the list.
     *
     * @return counter - int
     */
    public int getSizeOfFleet() {return starShipList.size();}

    /**
     * Fleet Name Getter
     *
     * @return name - String
     */
    public String getFleetName() {
        return name;
    }

    /**
     * Fleet Name Setter
     *
     * @param name - String
     */
    public void setFleetName(String name) {
        this.name = name;
    }
}
