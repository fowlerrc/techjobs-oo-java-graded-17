package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    public Job () {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this.id = nextId++; //calling the first constructor to initialize the id field
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {

        if (name.isEmpty()) {
            name = ("Data not available");
        }
        if (employer.getValue().equals("") || employer.getValue() == null) {
            employer.setValue("Data not available");

        }


        if (location.getValue().equals("") || location.getValue() == null) {
            location.setValue("Data not available");

        } if (positionType.getValue().equals("") || positionType.getValue() == null) {
           positionType.setValue("Data not available");

        } if (coreCompetency.getValue().equals("") || coreCompetency.getValue() == null) {
            coreCompetency.setValue("Data not available");
        }


        return System.lineSeparator() + "ID: " + this.id + System.lineSeparator() +
                "Name: " + this.name + System.lineSeparator() +
                "Employer: " + this.employer + System.lineSeparator() +
                "Location: " + this.location + System.lineSeparator() +
                "Position Type: " + this.positionType + System.lineSeparator() +
                "Core Competency: " + this.coreCompetency + System.lineSeparator();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
