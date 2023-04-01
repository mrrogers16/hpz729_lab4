package edu.utsa.cs3443.hpz729_lab4.model;

/**
 * This class represents a Crew Member object It has properties for the Crew
 * Members name, position, rank, and species as well as two constructors. One
 * with all Crew Member values and one with all values minus assignment. This
 * class also contains all setters and getters as well as an overwritten
 * toString method that serves as the base string representation of the Crew
 * Member object for the higher level to call on.
 *
 * @author Mickey Clarke hpz729
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 */
public class CrewMember {
    private String name; //Crew members name.
    private String position;//Crew members position.
    private String rank;//Crew members rank.
    private String species;//Crew members species.
    private String assignment;//Crew members assignment.
    private String registry;//Crew members assigned ship registry.

    /**
     * Crew Member Constructor with all values
     *
     * @param name-Crew     Members name
     * @param position-Crew Members position
     * @param rank-Crew     Members rank
     * @param species-Crew  Members species
     * @param assignment-Crew Members ship assignment
     */
    public CrewMember(String name, String position, String rank, String species, String assignment) {
        this.name = name;
        this.position = position;
        this.rank = rank;
        this.species = species;
        this.assignment = assignment;

    }

    /**
     * Crew Member Constructor without assignment
     *
     * @param name- Crew Members name
     * @param position- Crew Members position
     * @param rank- Crew Members rank
     * @param species- Crew  Members species
     */
    public CrewMember(String name, String position, String rank, String species) {
        this.name = name;
        this.position = position;
        this.rank = rank;
        this.species = species;
    }

    /**
     * This is the base toString method that is appended to the higher level
     * toStrings. It returns a string representation of a Crew Member object.
     * @return s - String
     */
    @Override
    public String toString() {
        String s = "- " + getName() + "  (" + getPosition() + ")" + "- " + getRank() + " [" + getSpecies() + "] ";
        return s;
    }

    /**
     * Crew Member Name Getter
     *
     * @return name - String
     */
    public String getName() {
        return name;
    }

    /**
     * Crew Member Name Setter
     *
     * @param name - String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Crew Member Position Getter
     *
     * @return position - String
     */
    public String getPosition() {
        return position;
    }

    /**
     * Crew Member Position Setter
     *
     * @param position - String
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Crew Member Rank Getter
     *
     * @return rank - String
     */
    public String getRank() {
        return rank;
    }

    /**
     * Crew Member Rank Setter
     *
     * @param rank - String
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * Crew Member Species Getter
     *
     * @return - String
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Crew Member Species Setter
     *
     * @param species - String
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Crew Member Assignment Getter
     *
     * @return assignment - String
     */
    public String getAssignment() {
        return assignment;
    }

    /**
     * Crew Member Assignment Setter
     *
     * @param assignment - String
     */
    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }
}