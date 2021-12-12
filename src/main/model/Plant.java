package main.model;

public class Plant {
    private String plantName;
    private double square;
    private int numberOf;
    private double wateringFrequency;
    private double waterVolumeForWatering;
    private double fertilizationFrequency;
    private int weightOfFertilizers;
    private double weedingFrequency;
    private int time;
    private double plannedHarvest;
    private boolean growthInGreenhouse;

    public Plant(String plantName, double square, int numberOf, double wateringFrequency, double waterVolumeForWatering, double fertilizationFrequency, int weightOfFertilizers, double weedingFrequency, int time, double plannedHarvest, boolean growthInGreenhouse) {
        this.plantName = plantName;
        this.square = square;
        this.numberOf = numberOf;
        this.wateringFrequency = wateringFrequency;
        this.waterVolumeForWatering = waterVolumeForWatering;
        this.fertilizationFrequency = fertilizationFrequency;
        this.weightOfFertilizers = weightOfFertilizers;
        this.weedingFrequency = weedingFrequency;
        this.plannedHarvest = plannedHarvest;
        this.time = time;
        this.growthInGreenhouse = growthInGreenhouse;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public boolean isGrowthInGreenhouse() {
        return growthInGreenhouse;
    }

    public double getPlannedHarvest() {
        return plannedHarvest;
    }

    public void setPlannedHarvest(double plannedHarvest) {
        this.plannedHarvest = plannedHarvest;
    }

    public double getFertilizationFrequency() {
        return fertilizationFrequency;
    }

    public void setFertilizationFrequency(double fertilizationFrequency) {
        this.fertilizationFrequency = fertilizationFrequency;
    }

    public double getWateringFrequency() {
        return wateringFrequency;
    }

    public void setWateringFrequency(double wateringFrequency) {
        this.wateringFrequency = wateringFrequency;
    }

    public void setGrowthInGreenhouse(boolean growthInGreenhouse) {
        this.growthInGreenhouse = growthInGreenhouse;
    }

    public double getWaterVolumeForWatering() {
        return waterVolumeForWatering;
    }

    public void setWaterVolumeForWatering(double waterVolumeForWatering) {
        this.waterVolumeForWatering = waterVolumeForWatering;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getWeedingFrequency() {
        return weedingFrequency;
    }

    public void setWeedingFrequency(double weedingFrequency) {
        this.weedingFrequency = weedingFrequency;
    }

    public int getWeightOfFertilizers() {
        return weightOfFertilizers;
    }

    public void setWeightOfFertilizers(int weightOfFertilizers) {
        this.weightOfFertilizers = weightOfFertilizers;
    }
}