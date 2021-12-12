package sample.model;

import java.util.ArrayList;

public class Parcel {
    private ArrayList<Plant> listOfPlants;
    private ArrayList<User> listOfUsers;
    private double squareOfParcel;
    private double usedSquareOfParcel;
    private boolean resourcesAvailability;

    public Parcel(ArrayList<Plant> listOfPlants, ArrayList<User> listOfUsers, double squareOfParcel, double usedSquareOfParcel, boolean resourcesAvailability) {
        this.listOfPlants = listOfPlants;
        this.listOfUsers = listOfUsers;
        this.squareOfParcel = squareOfParcel;
        this.usedSquareOfParcel = usedSquareOfParcel;
        this.resourcesAvailability = resourcesAvailability;
    }

    public double getSquareOfParcel() {
        return squareOfParcel;
    }

    public void setSquareOfParcel(double squareOfParcel) {
        this.squareOfParcel = squareOfParcel;
    }

    public double getUsedSquareOfParcel() {
        return usedSquareOfParcel;
    }

    public void setUsedSquareOfParcel(double usedSquareOfParcel) {
        this.usedSquareOfParcel = usedSquareOfParcel;
    }

    public void setResourcesAvailability(boolean resourcesAvailability) {
        this.resourcesAvailability = resourcesAvailability;
    }

    public boolean isResourcesAvailability() {
        return resourcesAvailability;
    }

    public ArrayList<Plant> getListOfPlants() {
        return listOfPlants;
    }

    public void setListOfPlants(ArrayList<Plant> listOfPlants) {
        this.listOfPlants = listOfPlants;
    }

    public ArrayList<User> getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(ArrayList<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }
}
