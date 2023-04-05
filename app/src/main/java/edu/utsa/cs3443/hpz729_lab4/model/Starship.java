package edu.utsa.cs3443.hpz729_lab4.model;

/**
 * This class represents a Starship object
 * It has properties for the Starships name, registry, and ship class as well as an initialized
 * ArrayList of CrewMember object.
 * This class also contains all setters and getters as well as a
 * methods for returning the number of personnel and an overwritten toString method that calls
 * the toString from the CrewMember class.
 *
 * @author Mickey Clarke hpz729
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 */
import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Starship {
    private String name;//The name of a Starship.
    private String registryName;//The name of the registry of the Starship
    private String shipClass;//The class of the Starship
    private ArrayList<CrewMember> crewList = new ArrayList<CrewMember>();//An ArrayList of CrewMember objects named crewList.



    public Starship(){

    }
    /**
     * Starship Constructor
     *
     * @param name- Ships name
     * @param registry- Ships registry
     * @param shipClass- Ships class
     */
    public Starship(String name, String registry, String shipClass) {
        this.name = name;
        this.registryName = registry;
        this.shipClass = shipClass;
        this.crewList = new ArrayList<>();
    }


    /**
     *
     * @param filepath
     * @return
     * @throws IOException
     */
    public void loadPersonnelCSV(Context context, String filepath) throws IOException
    {
        ArrayList<CrewMember> crewList = new ArrayList<>();

        AssetManager assetManager = context.getAssets();
        InputStream inputStream = assetManager.open(filepath);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = br.readLine()) != null) {
            String[] fields = line.split(",");
            if (fields.length == 5) {
                String name = fields[0];
                String position = fields[1];
                String rank = fields[2];
                String registry = fields[3];
                String species = fields[4];

                CrewMember crewMember = new CrewMember(name, position, rank, registry, species);
                crewList.add(crewMember);

            }
        }
    }


    /**
     * getNumberOfPersonel returns an int representing the number of personel in the crewList ArrayList
     * @return counter-the number of personell in the crewList
     */
    public int getNumberOfPersonnel() {
        int counter = 0;
        for (int i = 0; i < crewList.size(); i++) {
            counter += 1;
        }
        return counter;
    }

    /**
     * toString method that initializes an empty String named S and a String named
     * member that is null. It then checks the size of the crewList to determine if
     * plural or not. Next, String s is appended, then crewList is looped through
     * and retrieved and appended to the end of string s.
     * @return s
     */
    @Override
    public String toString() {
        String s = "";
        String member = null;
        if (crewList.size() == 1) {
            member = "member";
        } else {
            member = "members";
        }
        s += getShipName() + ", " + getShipClass() + ". Registry: " + getRegistry() + "\n" + getNumberOfPersonnel()
                + " crew " + member + " assigned.\n";
        for (int i = 0; i < crewList.size(); i++) {
            s += crewList.get(i).toString() + "\n";
        }

        return s;
    }

    /**
     * This is the addCrewMember(…) method which takes a CrewMember parameter and
     * adds them to the starship and returns nothing
     *
     * @param p
     */
    public void addCrewMember(CrewMember p) {
        crewList.add(p);
    }

    /**
     * @return name: the ships name
     */
    public String getShipName() {
        return name;
    }

    /**
     * Ship Name Setter
     *
     * @param name
     */
    public void setShipName(String name) {
        this.name = name;
    }

    /**
     * Ship Registry Getter
     *
     * @return registryName
     */
    public String getRegistry() {
        return registryName;
    }

    /**
     * Ship Registry Setter
     *
     * @param registry
     */
    public void setRegistry(String registry) {
        this.registryName = registry;
    }

    /**
     * Ship Class Getter
     *
     * @return Starship Class
     */
    public String getShipClass() {
        return shipClass;
    }

    /**
     * Ship Class Setter
     *
     * @param shipClass to set
     */
    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    /**
     * Crew List Getter
     *
     * @return the crewList ArrayList
     */
    public ArrayList<CrewMember> getCrewList() {
        for (int i = 0; i < crewList.size() - 1; i++) {
            crewList.get(i);
        }
        return crewList;
    }

    /**
     * Crew List Setter
     *
     * @param crewList
     */
    public void setCrewList(ArrayList<CrewMember> crewList) {
        this.crewList = crewList;
    }
}