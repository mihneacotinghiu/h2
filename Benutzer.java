package com.company;
import java.util.*;


public class Benutzer {
    private String firstName;
    private String lastName;
    private List<Sport> sports;

    /**
     * Instantiates a new User.
     * @param firstName the first name
     * @param lastName  the last name
     * @param sports    the sports
     */
    public Benutzer(String firstName, String lastName, List<Sport> sports) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sports = sports;
    }

    /**
     * Gets first name.
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets sports.
     * @return the sports
     */
    public List<Sport> getSports() {
        return sports;
    }

    /**
     * Sets sports.
     * @param sports the sports
     */
    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }


    /**
     * @returns the hours the user played in total
     * by initializing a double variable and making the sum.
     */
    public double calculateTime(){
        double time=0;
        for(Sport i : this.sports)
            time += i.calculateTime();
        return time;
    }

    /**
     * Calculate time of a certain favorite sport.
     * @param s the s
     * @return the double
     */
    public double calculateTime(Sport s){
        double time=0;
        for(Sport i : this.sports)
            if(s.getClass() == i.getClass())
                time += i.calculateTime();

        return time;
    }

    /**
     * Calculate medium time double type.
     * @return the double
     */
    public double calculateMediumTime() {
        double time = 0;
        for(Sport i : this.sports)
            time += i.calculateTime();
        time /= sports.size();
        return time;
    }
}
