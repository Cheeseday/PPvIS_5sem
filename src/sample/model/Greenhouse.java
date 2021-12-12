package sample.model;

import java.util.ArrayList;

public class Greenhouse {
    private double squareOfGreenhouse;
    private double usedSquare;
    private ArrayList<Plant> plantInGreenhouse;

    public Greenhouse(double squareOfGreenhouse, double usedSquare, ArrayList<Plant> plantInGreenhouse) {
        this.squareOfGreenhouse = squareOfGreenhouse;
        this.usedSquare = usedSquare;
        this.plantInGreenhouse = plantInGreenhouse;
    }

    public ArrayList<Plant> getPlantInGreenhouse() {
        return plantInGreenhouse;
    }

    public void setPlantInGreenhouse(ArrayList<Plant> plantInGreenhouse) {
        this.plantInGreenhouse = plantInGreenhouse;
    }

    public double getSquareOfGreenhouse() {
        return squareOfGreenhouse;
    }

    public void setSquareOfGreenhouse(double squareOfGreenhouse) {
        this.squareOfGreenhouse = squareOfGreenhouse;
    }

    public double getUsedSquare() {
        return usedSquare;
    }

    public void setUsedSquare(double usedSquare) {
        this.usedSquare = usedSquare;
    }
}
